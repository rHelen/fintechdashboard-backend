package com.finsight.service;

import com.finsight.entity.Category;
import com.finsight.repository.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    private final CategoryRepository repository;

    public CategoryService(CategoryRepository repository) {
        this.repository = repository;
    }

    public List<Category> findByUser(Long userId) {
        return repository.findByUserId(userId);
    }

    public Category findById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Categoria não encontrada"));
    }

    public Category save(Category category) {
        return repository.save(category);
    }

    public Category update(Long id, Category data) {
        Category category = findById(id);

        category.setName(data.getName());
        category.setColor(data.getColor());

        return repository.save(category);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }
}