package com.szcsy.service;

import com.szcsy.domin.User;

import java.util.List;

public interface UserService {

    //查询所有
    public List<User> findAll();


    //ID查询
    public User findOne(int id);


    //保存更新
    public void save(User user);
}
