package service;

import entity.Category;
import entity.Genre;

import java.util.List;

public interface IGenreService {
    Genre addGenre(String name, Category category);

    void deleteGenre(String name, Category category);

    Genre getGenre(String name, Category category);

    List<Genre> getAllGenres();
}
