package service;

import entity.Category;
import entity.Type;

import java.util.List;

public interface ICategoryService {
    Category addCategory(String name, Type type);

    void deleteCategory(String name, Type type);

    Category getCategory(String name, Type type);

    List<Category> getAllCategories();
}
