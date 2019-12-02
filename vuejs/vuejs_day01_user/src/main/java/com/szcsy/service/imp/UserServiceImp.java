package com.szcsy.service.imp;

import com.szcsy.dao.UserDao;
import com.szcsy.domin.User;
import com.szcsy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Transactional
@Service
public class UserServiceImp implements UserService {

    @Autowired
    public UserDao userDao;


    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public User findOne(int id) {
        return userDao.findOne(id);
    }

    @Override
    public void save(User user) {

        userDao.save(user);
    }
}
