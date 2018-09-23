package service.impl;

import entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.ItemRepository;
import service.IItemService;

import java.time.LocalDate;
import java.util.List;

@Service
public class ItemService implements IItemService {

    private ItemRepository itemRepository;

    @Autowired
    public ItemService(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }


    @Override
    public Item addItem() {
        return null;
    }

    @Override
    public void deleteItem() {

    }

    @Override
    public Item getItem() {
        return null;
    }

    @Override
    public List<Item> getAllItems() {
        return null;
    }

    @Override
    public List<Item> getItemByUser(User user) {
        return null;
    }

    @Override
    public Item getItemByName(String name) {
        return null;
    }

    @Override
    public List<Item> getItemByYear(LocalDate year) {
        return null;
    }

    @Override
    public Item getItemByNameAndYear(String name, LocalDate year) {
        return null;
    }

    @Override
    public List<Item> getItemsByType(Type type) {
        return null;
    }

    @Override
    public List<Item> getItemsByCategory(Category category) {
        return null;
    }

    @Override
    public List<Item> getItemsByGenre(Genre genre) {
        return null;
    }

    @Override
    public List<Item> getItemsByTypeAndCategoryAndGenre(Type type, Category category, Genre genre) {
        return null;
    }

    @Override
    public List<Item> getItemsByTypeAndYear(Type type, LocalDate year) {
        return null;
    }

    @Override
    public List<Item> getItemsByCategoryAndYear(Category category, LocalDate year) {
        return null;
    }

    @Override
    public List<Item> getItemsByGenreAndYear(Genre genre, LocalDate year) {
        return null;
    }

    @Override
    public List<Item> getItemsByTypeAndCategory(Type type, Category category) {
        return null;
    }

    @Override
    public List<Item> getItemsByCategoryAndGenre(Category category, Genre genre) {
        return null;
    }

    @Override
    public List<Item> getItemsByUserAndYear(User user, LocalDate localDate) {
        return null;
    }

    @Override
    public List<Item> getItemsByUserAndType(User user, Type type) {
        return null;
    }

    @Override
    public List<Item> getItemsByUserAndCategory(User user, Category category) {
        return null;
    }

    @Override
    public List<Item> getItemsByUserAndGenre(User user, Genre genre) {
        return null;
    }

    @Override
    public List<Item> getItemsByUserAndTypeAndCategoryAndGenre(User user, Type type, Category category, Genre genre) {
        return null;
    }

    @Override
    public List<Item> getItemsByRate(Rate rate) {
        return null;
    }

    @Override
    public List<Item> getItemsByTypeAndRate(Type type, Rate rate) {
        return null;
    }

    @Override
    public List<Item> getItemsByCategoryAndRate(Category category, Rate rate) {
        return null;
    }

    @Override
    public List<Item> getItemsByGenreAndRate(Genre genre, Rate rate) {
        return null;
    }

    @Override
    public List<Item> getItemsByTypeAndCategoryAndRate(Type type, Category category, Rate rate) {
        return null;
    }

    @Override
    public List<Item> getItemsByCategoryAndGenreAndRate(Category category, Genre genre, Rate rate) {
        return null;
    }

    @Override
    public List<Item> getItemsByTypeAndCategoryAndGenreAndRate(Type type, Category category, Genre genre, Rate rate) {
        return null;
    }

    @Override
    public List<Item> getItemsByYearAndRate(LocalDate year, Rate rate) {
        return null;
    }

    @Override
    public List<Item> getItemsByPrivate(boolean isPrivate) {
        return null;
    }

    @Override
    public List<Item> getItemsByWatched(boolean isWatched) {
        return null;
    }

    @Override
    public List<Item> getItemsByImportant(boolean isImportant) {
        return null;
    }

    @Override
    public List<Item> getItemsByPrivateAndType(boolean isPrivate, Type type) {
        return null;
    }

    @Override
    public List<Item> getItemsByPrivateAndCategory(boolean isPrivate, Category category) {
        return null;
    }

    @Override
    public List<Item> getItemsByPrivateAndGenre(boolean isPrivate, Genre genre) {
        return null;
    }

    @Override
    public List<Item> getItemsByWatchedAndType(boolean isWatched, Type type) {
        return null;
    }

    @Override
    public List<Item> getItemsByWatchedAndCategory(boolean isWatched, Category category) {
        return null;
    }

    @Override
    public List<Item> getItemsByWatchedAndGenre(boolean isWatched, Genre genre) {
        return null;
    }

    @Override
    public List<Item> getItemsByImportantAndType(boolean isImportant, Type type) {
        return null;
    }

    @Override
    public List<Item> getItemsByImportantAndCategory(boolean isImportant, Category category) {
        return null;
    }

    @Override
    public List<Item> getItemsByImportantAndGenre(boolean isImportant, Genre genre) {
        return null;
    }
}
