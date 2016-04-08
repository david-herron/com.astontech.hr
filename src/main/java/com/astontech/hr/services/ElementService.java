package com.astontech.hr.services;

import com.astontech.hr.domain.Element;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by daviherr1 on 4/8/2016.
 */
@Service
public interface ElementService {

    Iterable<Element> listAllElements();

    Element getElementById(Integer id);

    Element saveElement(Element element);

    Iterable<Element> saveElementList(Iterable<Element> element);

    void deleteElement(Integer id);

    Element findByElementName (String elementName);

    List<Element> findAllByElementName(String elementName);

    List<Element> findAllByElementNameIgnoreCase(String elementName);
}
