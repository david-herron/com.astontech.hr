package com.astontech.hr.services;

import com.astontech.hr.domain.Element;
import com.astontech.hr.domain.ElementType;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by daviherr1 on 4/8/2016.
 */
@Service
public interface ElementTypeService {

    Iterable<ElementType> listAllElementTypes();

    ElementType getElementTypeById(Integer id);

    ElementType saveElementType(ElementType elementType);

    Iterable<ElementType> saveElementTypeList(Iterable<ElementType> elementType);

    void deleteElementType(Integer id);

    ElementType findByElementType (String elementType);

    List<ElementType> findAllByElementType(String elementType);

    List<ElementType> findAllByElementTypeIgnoreCase(String elementType);
}
