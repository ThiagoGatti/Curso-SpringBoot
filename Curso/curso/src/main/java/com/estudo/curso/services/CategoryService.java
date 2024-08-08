package com.estudo.curso.services;

import com.estudo.curso.entity.Category;
import com.estudo.curso.entity.Order;
import com.estudo.curso.repositories.CategoryRepository;
import com.estudo.curso.repositories.OrderRepository;
import com.estudo.curso.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll() {
        return repository.findAll();
    }

    public Category findById(Long id) {
        Optional<Category> cat = repository.findById(id);
        return cat.get();
    }
}
