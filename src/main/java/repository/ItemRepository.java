package repository;

import entity.*;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.Collection;
import java.util.List;

public interface ItemRepository extends JpaRepository<Item, Long> {
    //List<Item> findByUsersToItems(Collection userToItems);
    Item findByName(String name);
    List<Item> findByYear(LocalDate year);
    Item findByNameAndYear(String name,LocalDate year);
    List<Item> findByType(Type type);
    List<Item> findByCategory(Category category);
    //List<Item> findByGenre(Genre genre);
    List<Item> findAll();
    //List<Item> findByTypeAndCategoryAndGenre(Type type,Category category,Genre genre);
    List<Item> findByTypeAndYear(Type type,LocalDate year);
    List<Item> findByCategoryAndYear(Category category, LocalDate year);
    //List<Item> findByGenreAndYear(Genre genre, LocalDate year);
    List<Item> findByTypeAndCategory(Type type,Category category);
    //List<Item> findByCategoryAndGenre(Category category,Genre genre);
//    List<Item> findByUserAndYear(User user, LocalDate localDate);
//    List<Item> findByUserAndType(User user, Type type);
//    List<Item> findByUserAndCategory(User user, Category category);
    //List<Item> findByUserAndGenre(User user, Genre genre);
    //List<Item> findByUserAndTypeAndCategoryAndGenre(User user, Type type,Category category, Genre genre);

    List<Item> findByRate(Rate rate);
    List<Item> findByTypeAndRate(Type type, Rate rate);
    List<Item> findByCategoryAndRate(Category category, Rate rate);
    //List<Item> findByGenreAndRate(Genre genre, Rate rate);
    List<Item> findByTypeAndCategoryAndRate(Type type, Category category, Rate rate);
    //List<Item> findByCategoryAndGenreAndRate(Category category, Genre genre, Rate rate);
    //List<Item> findByTypeAndCategoryAndGenreAndRate(Type type, Category category, Genre genre, Rate rate);
    List<Item> findByYearAndRate(LocalDate year, Rate rate);

    List<Item> findByPrivateBoolean(boolean isPrivate);
    List<Item> findByWatchedBoolean(boolean isWatched);
    List<Item> findByImportantBoolean(boolean isImportant);
//    List<Item> findByPrivateAndType(boolean isPrivateBoolean, Type type);
//    List<Item> findByPrivateAndCategory(boolean isPrivateBoolean, Category category);
//    List<Item> findByPrivateAndGenre(boolean isPrivateBoolean, Genre genre);
//    List<Item> findByWatchedAndType(boolean isWatchedBoolean, Type type);
//    List<Item> findByWatchedAndCategory(boolean isWatchedBoolean, Category category);
//
//    List<Item> findByImportantAndType(boolean isImportantBoolean, Type type);
//    List<Item> findByImportantAndCategory(boolean isImportantBoolean, Category category);
//    List<Item> findByImportantAndGenre(boolean isImportantBoolean, Genre genre);


}
