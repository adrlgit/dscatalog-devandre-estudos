package com.devandre.dscatalog.repositories;

import com.devandre.dscatalog.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Categoryepository extends JpaRepository<Category, Long> {
}
