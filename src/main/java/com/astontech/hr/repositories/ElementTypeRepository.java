package com.astontech.hr.repositories;

import com.astontech.hr.domain.Element;
import com.astontech.hr.domain.ElementType;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by daviherr1 on 4/7/2016.
 */
public interface ElementTypeRepository extends CrudRepository<ElementType, Integer>{

    ElementType findByElementType (String elementType);

    List<ElementType> findAllByElementType(String elementType);

    List<ElementType> findAllByElementTypeIgnoreCase(String elementType);
}
