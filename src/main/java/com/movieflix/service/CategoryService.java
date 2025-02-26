package com.movieflix.service;

import com.movieflix.entity.Category;
import com.movieflix.repository.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    private final CategoryRepository repository;

    public CategoryService(CategoryRepository repository) {
        this.repository = repository;
    }

    public List<Category> findAll() {
        return repository.findAll();
    }

    public Category saveCategory(Category category) {
        return repository.save(category);
    }

    public Optional<Category> update(Long id, Category updatedCateogry) {
        Optional<Category> optionalCategory = repository.findById(id);
        if (optionalCategory.isPresent()) {
            Category category = optionalCategory.get();
            category.setName(updatedCateogry.getName());

            repository.save(category);
            return Optional.of(category);
        }
        return Optional.empty();
    }

    public Optional<Category> findById(Long id) {
        return repository.findById(id);
    }

    public void deleteCategory(Long id) {
        repository.deleteById(id);
    }
}
