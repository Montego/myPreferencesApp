package service.impl;

import entity.Type;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.ItemRepository;
import repository.TypeRepository;
import service.ITypeService;

import java.util.List;
@Service
public class TypeService implements ITypeService {

    private TypeRepository typeRepository;
    @Autowired
    public TypeService(TypeRepository typeRepository){
        this.typeRepository = typeRepository;
    }

    @Override
    public Type addType(String name) {
        return null;
    }

    @Override
    public void deleteType(String name) {

    }

    @Override
    public Type getType(String name) {
        return null;
    }

    @Override
    public List<Type> getAllTypes() {
        return null;
    }
}
