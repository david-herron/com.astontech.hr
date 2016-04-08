package com.astontech.hr.bootstrap;

import com.astontech.hr.domain.Element;
import com.astontech.hr.domain.ElementType;
import com.astontech.hr.services.ElementService;
import com.astontech.hr.services.ElementTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by daviherr1 on 4/8/2016.
 */
@Component
public class SeedData implements ApplicationListener<ContextRefreshedEvent>{

    @Autowired
    private ElementService elementService;

    @Autowired
    private ElementTypeService elementTypeService;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        generateElementAndElementTypes();
    }

    private void generateElementAndElementTypes() {

    //Adding laptop
        ElementType laptopType = new ElementType("Laptop");

        List<Element> elementList = new ArrayList<>();
        elementList.add(new Element("Acer"));
        elementList.add(new Element("Dell"));
        elementList.add(new Element("Apple"));
        elementList.add(new Element("Samsung"));
        elementList.add(new Element("Asus"));

        laptopType.setElementList(elementList);

        elementTypeService.saveElementType(laptopType);

    //Adding Utensils
        ElementType writingUtensilType = new ElementType("Utensil");

        List<Element> elementList2 = new ArrayList<>();
        elementList2.add(new Element("Sharpie"));
        elementList2.add(new Element("Bic"));
        elementList2.add(new Element("USA Gold"));

        writingUtensilType.setElementList(elementList2);

        elementTypeService.saveElementType(writingUtensilType);

    //Adding work
        ElementType workType = new ElementType("Work");

        List<Element> elementList3 = new ArrayList<>();
        elementList3.add(new Element("Email"));
        elementList3.add(new Element("Phone"));;

        workType.setElementList(elementList3);

        elementTypeService.saveElementType(workType);
    }

}
