package service.impl;

import entity.Authority;
import entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.UserRepository;
import service.IUserService;

import java.time.LocalDate;
import java.util.List;
@Service
public class UserService implements IUserService {

    private UserRepository userRepository;
    @Autowired
    public UserService(UserRepository userRepository){
        this.userRepository = userRepository;
    }

    @Override
    public User addUser(User user) {
        return null;
    }

    @Override
    public void deleteUser(User user) {

    }

    @Override
    public List<User> getUsers() {
        return null;
    }

    @Override
    public User getUserByNickname(String nickname) {
        return null;
    }

    @Override
    public User getUserByEmail(String email) {
        return null;
    }

    @Override
    public List<User> getUsersByRoles(Authority role) {
        return null;
    }

    @Override
    public List<User> getUserByDate(LocalDate registratedDate) {
        return null;
    }
}
