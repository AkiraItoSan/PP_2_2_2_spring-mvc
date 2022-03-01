package web.services;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDao;
import web.models.User;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Transactional
    @Override
    public void updateUser(User user) {
        userDao.save(user);
    }

    @Transactional
    @Override
    public void remove(User user) {
        userDao.delete(user);
    }

    @Transactional
    @Override
    public void add(User user) {
        userDao.save(user);
    }

    @Transactional(readOnly = true)
    @Override
    public List<User> listUsers() {
        return userDao.findAll();
    }

    @Transactional
    @Override
    public User getUserById(Long id) {
        return userDao.findById(id).orElseThrow();
    }
}
