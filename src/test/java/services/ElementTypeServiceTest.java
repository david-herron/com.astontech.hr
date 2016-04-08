package services;

import com.astontech.hr.Application;
import com.astontech.hr.domain.Element;
import com.astontech.hr.domain.ElementType;
import com.astontech.hr.services.ElementService;
import com.astontech.hr.services.ElementTypeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

/**
 * Created by daviherr1 on 4/8/2016.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes= {Application.class})
@WebAppConfiguration
public class ElementTypeServiceTest {

    @Autowired
    private ElementTypeService elementTypeService;

    @Test
    public void elementTypeServiceSaveTest() {
        ElementType elementType = new ElementType("ServiceTest");

        //save element type, verify it has an id after the save.
        assertNull(elementType.getId());
        elementTypeService.saveElementType(elementType);
        assertNotNull(elementType.getId());

        //fetch
        ElementType fetchedElementType = elementTypeService.getElementTypeById(elementType.getId());
        assertNotNull(fetchedElementType);
        assertEquals(elementType.getId(), fetchedElementType.getId());

        //update
        fetchedElementType.setElementType("Work");
        elementTypeService.saveElementType(fetchedElementType);

        ElementType updatedElementType = elementTypeService.getElementTypeById(fetchedElementType.getId());
        assertEquals(updatedElementType.getElementType(), "Work");
    }
}
