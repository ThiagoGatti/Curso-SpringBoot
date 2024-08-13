package com.estudo.curso.services;

import com.estudo.curso.entity.Category;
import com.estudo.curso.entity.Product;
import com.estudo.curso.repositories.CategoryRepository;
import com.estudo.curso.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repository;

    public List<Product> findAll() {
        return repository.findAll();
    }

    public Product findById(Long id) {
        Optional<Product> cat = repository.findById(id);
        return cat.get();
    }
}
