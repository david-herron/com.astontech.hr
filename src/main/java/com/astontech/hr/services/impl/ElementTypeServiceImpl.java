package com.astontech.hr.services.impl;

import com.astontech.hr.domain.ElementType;
import com.astontech.hr.repositories.ElementTypeRepository;
import com.astontech.hr.services.ElementTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by daviherr1 on 4/8/2016.
 */
@Service
public class ElementTypeServiceImpl implements ElementTypeService{

    @Autowired
    private ElementTypeRepository elementTypeRepository;

    @Override
    public Iterable<ElementType> listAllElementTypes() {
        return elementTypeRepository.findAll();
    }

    @Override
    public ElementType getElementTypeById(Integer id) {
        return elementTypeRepository.findOne(id);
    }

    @Override
    public ElementType saveElementType(ElementType elementType) {
        return elementTypeRepository.save(elementType);
    }

    @Override
    public Iterable<ElementType> saveElementTypeList(Iterable<ElementType> elementTypeIterable) {
        return elementTypeRepository.save(elementTypeIterable);
    }

    @Override
    public void deleteElementType(Integer id) {
        elementTypeRepository.delete(id);
    }

    @Override
    public ElementType findByElementType(String elementType) {
        return elementTypeRepository.findByElementType(elementType);
    }

    @Override
    public List<ElementType> findAllByElementType(String elementType) {
        return elementTypeRepository.findAllByElementType(elementType);
    }

    @Override
    public List<ElementType> findAllByElementTypeIgnoreCase(String elementType) {
        return elementTypeRepository.findAllByElementTypeIgnoreCase(elementType);
    }
}
