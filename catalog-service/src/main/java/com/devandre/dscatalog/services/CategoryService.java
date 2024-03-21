package com.devandre.dscatalog.services;

import com.devandre.dscatalog.dto.CategoryDTO;
import com.devandre.dscatalog.entities.Category;
import com.devandre.dscatalog.repositories.Categoryepository;
import com.devandre.dscatalog.services.exceptions.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class CategoryService {

    @Autowired
    private  Categoryepository categoryepository;

    @Transactional(readOnly = true)
    public List<CategoryDTO> findAll() {
        List<Category> listDto = categoryepository.findAll();
        return listDto.stream().map(x -> new CategoryDTO(x)).collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public CategoryDTO findById(Long id) {
        Optional<Category> obj = categoryepository.findById(id);
        Category entity = obj.orElseThrow(() -> new EntityNotFoundException("Entity not found"));
        return new CategoryDTO(entity);
    }
}
