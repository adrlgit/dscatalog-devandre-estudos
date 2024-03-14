package com.devandre.dscatalog.services;

import com.devandre.dscatalog.entities.Category;
import com.devandre.dscatalog.repositories.Categoryepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private  Categoryepository categoryepository;

    public List<Category> findAll() {
        return categoryepository.findAll();
    }

}
