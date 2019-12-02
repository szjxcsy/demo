package com.szcsy.controller;


import com.szcsy.domin.User;
import com.szcsy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import java.util.List;


@ResponseBody  //将对象转换成json
@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;



    @RequestMapping(value = "/findAll")
    public List<User> findAll(){

        List<User> list = userService.findAll();

        return list;
    }


 /*   // 使用restful接收id属性值;restful风格：url="user/findOne/10"
    @RequestMapping(value = "/findOne")
    public User findOne(@PathVariable("id") Integer id){

        User one = userService.findOne(id);

        return one;
    }*/

    //传统方式接受id属性值;传统方式:url="user/findOne?id=10"
    @RequestMapping(value = "/findOne")
    public User findOne(Integer id){

        User user = userService.findOne(id);

        return user;
    }



    @RequestMapping(value = "/update")
    public void update(@RequestBody User user){

        userService.save(user);

    }

}
