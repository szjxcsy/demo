package com.szcsy.dao;


import com.szcsy.domin.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserDao extends JpaRepository<User,Integer> {



}
