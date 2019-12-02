package com.szcsy.dao;

import com.szcsy.domin.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserDao extends JpaRepository<User,Integer> {
    void update(User user);

    List<User> findAll();

    User findOne(int id);
}
