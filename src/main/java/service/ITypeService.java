package service;

import entity.Type;

import java.util.List;

public interface ITypeService {
    Type addType(String name);

    void deleteType(String name);

    Type getType(String name);

    List<Type> getAllTypes();
}
