package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDao;
import web.models.User;
import java.util.List;

@Service
public class UserServiceImlp implements UserService{

    @Autowired
    UserDao userDao;

    @Transactional
    @Override
    public List<User> index() {
        return userDao.index();
    }

    @Transactional
    @Override
    public User show(long id) {
        return userDao.show(id);
    }

    @Transactional
    @Override
    public void save(User user) {
        userDao.save(user);

    }

    @Transactional
    @Override
    public void update(long id, User updateUser) {
        userDao.update(id, updateUser);
    }

    @Transactional
    @Override
    public void delete(long id) {
        userDao.delete(id);
    }
}
