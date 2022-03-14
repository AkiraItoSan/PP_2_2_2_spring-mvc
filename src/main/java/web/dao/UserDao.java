package web.dao;


import web.models.User;

import java.util.List;

public interface UserDao {
    void updateUser(User user);
    void remove(User user);
    void add(User user);
    List<User> listUsers();
    User getUserById(Long id);

}
