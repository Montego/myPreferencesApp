package service.impl;

import entity.Category;
import entity.Type;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.CategoryRepository;
import service.ICategoryService;

import java.util.List;

@Service
public class CategoryService implements ICategoryService {

    private CategoryRepository categoryRepository;

    @Autowired
    public CategoryService(CategoryRepository categoryRepository){
        this.categoryRepository = categoryRepository;
    }

    @Override
    public Category addCategory(String name, Type type) {
        return null;
    }

    @Override
    public void deleteCategory(String name, Type type) {

    }

    @Override
    public Category getCategory(String name, Type type) {
        return null;
    }

    @Override
    public List<Category> getAllCategories() {
        return null;
    }
}
