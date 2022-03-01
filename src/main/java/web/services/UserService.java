package web.services;

import web.models.User;

import java.util.List;

public interface UserService {
    void add(User user);

    List<User> listUsers();

    void updateUser(User user);

    void remove(User user);

    User getUserById(Long id);
}
