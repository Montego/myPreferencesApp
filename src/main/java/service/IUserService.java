package service;

import entity.Authority;
import entity.User;

import java.time.LocalDate;
import java.util.List;

public interface IUserService {
    User addUser(User user);

    void deleteUser(User user);

    List<User> getUsers();

    User getUserByNickname(String nickname);

    User getUserByEmail(String email);

    List<User> getUsersByRoles(Authority role);

    List<User> getUserByDate(LocalDate registratedDate);
}
