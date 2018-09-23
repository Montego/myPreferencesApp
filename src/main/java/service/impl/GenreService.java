package service.impl;

import entity.Category;
import entity.Genre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.GenreRepository;
import service.IGenreService;

import java.util.List;
@Service
public class GenreService implements IGenreService {

    private GenreRepository genreRepository;
    @Autowired
    public GenreService(GenreRepository genreRepository){
        this.genreRepository = genreRepository;
    }

    @Override
    public Genre addGenre(String name, Category category) {
        return null;
    }

    @Override
    public void deleteGenre(String name, Category category) {

    }

    @Override
    public Genre getGenre(String name, Category category) {
        return null;
    }

    @Override
    public List<Genre> getAllGenres() {
        return null;
    }
}
