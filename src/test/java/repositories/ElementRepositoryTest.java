package repositories;

import com.astontech.hr.configuration.RepositoryConfiguration;
import com.astontech.hr.domain.Element;
import com.astontech.hr.repositories.ElementRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

/**
 * Created by daviherr1 on 4/7/2016.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes= {RepositoryConfiguration.class})
public class ElementRepositoryTest {

    @Autowired
    private ElementRepository elementRepository;

    @Test
    public void testSaveElement() {
        // setup element
        Element element = new Element();
        element.setElementName("Phone");

        //save element, verify it has an id after the save.
        assertNull(element.getId());
        elementRepository.save(element);
        assertNotNull(element.getId());

        //fetch
        Element fetchedElement = elementRepository.findOne(element.getId());
        assertNotNull(fetchedElement);
        assertEquals(element.getId(), fetchedElement.getId());

        //update
        fetchedElement.setElementName("Email");
        elementRepository.save(fetchedElement);

        Element updatedElement = elementRepository.findOne(fetchedElement.getId());
        assertEquals(updatedElement.getElementName(), "Email");
    }

    @Testdfg

}
