package com.astontech.hr.repositories;

import com.astontech.hr.domain.Element;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by daviherr1 on 4/7/2016.
 */
public interface ElementRepository extends CrudRepository<Element, Integer>{

    // This will generate the required code from the structure of the method name
    Element findByElementName (String elementName);

    List<Element> findAllByElementName(String elementName);

    List<Element> findAllByElementNameIgnoreCase(String elementName);

}
