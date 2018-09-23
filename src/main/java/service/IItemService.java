package service;

import entity.*;

import java.time.LocalDate;
import java.util.List;

public interface IItemService {
    Item addItem();

    void deleteItem();

    Item getItem();

    List<Item> getAllItems();

    List<Item> getItemByUser(User user);
    Item getItemByName(String name);
    List<Item> getItemByYear(LocalDate year);
    Item getItemByNameAndYear(String name,LocalDate year);
    List<Item> getItemsByType(Type type);
    List<Item> getItemsByCategory(Category category);
    List<Item> getItemsByGenre(Genre genre);

    List<Item> getItemsByTypeAndCategoryAndGenre(Type type,Category category,Genre genre);
    List<Item> getItemsByTypeAndYear(Type type,LocalDate year);
    List<Item> getItemsByCategoryAndYear(Category category, LocalDate year);
    List<Item> getItemsByGenreAndYear(Genre genre, LocalDate year);
    List<Item> getItemsByTypeAndCategory(Type type,Category category);
    List<Item> getItemsByCategoryAndGenre(Category category,Genre genre);
    List<Item> getItemsByUserAndYear(User user, LocalDate localDate);
    List<Item> getItemsByUserAndType(User user, Type type);
    List<Item> getItemsByUserAndCategory(User user, Category category);
    List<Item> getItemsByUserAndGenre(User user, Genre genre);
    List<Item> getItemsByUserAndTypeAndCategoryAndGenre(User user, Type type,Category category, Genre genre);

    List<Item> getItemsByRate(Rate rate);
    List<Item> getItemsByTypeAndRate(Type type, Rate rate);
    List<Item> getItemsByCategoryAndRate(Category category, Rate rate);
    List<Item> getItemsByGenreAndRate(Genre genre, Rate rate);
    List<Item> getItemsByTypeAndCategoryAndRate(Type type, Category category, Rate rate);
    List<Item> getItemsByCategoryAndGenreAndRate(Category category, Genre genre, Rate rate);
    List<Item> getItemsByTypeAndCategoryAndGenreAndRate(Type type, Category category, Genre genre, Rate rate);
    List<Item> getItemsByYearAndRate(LocalDate year, Rate rate);

    List<Item> getItemsByPrivate(boolean isPrivate);
    List<Item> getItemsByWatched(boolean isWatched);
    List<Item> getItemsByImportant(boolean isImportant);
    List<Item> getItemsByPrivateAndType(boolean isPrivate, Type type);
    List<Item> getItemsByPrivateAndCategory(boolean isPrivate, Category category);
    List<Item> getItemsByPrivateAndGenre(boolean isPrivate, Genre genre);
    List<Item> getItemsByWatchedAndType(boolean isWatched, Type type);
    List<Item> getItemsByWatchedAndCategory(boolean isWatched, Category category);
    List<Item> getItemsByWatchedAndGenre(boolean isWatched, Genre genre);
    List<Item> getItemsByImportantAndType(boolean isImportant, Type type);
    List<Item> getItemsByImportantAndCategory(boolean isImportant, Category category);
    List<Item> getItemsByImportantAndGenre(boolean isImportant, Genre genre);

}
