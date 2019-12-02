package com.szcsy.controller;


import com.alibaba.dubbo.config.annotation.Reference;
import com.szcsy.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@RequestMapping(value = "/demo")
@Controller
public class HelloController {


    @Reference
    private HelloService helloService;


    @ResponseBody
    @RequestMapping(value = "/hello")
    public String getName(String name){

        String result = helloService.sayHello(name);

        System.out.println(result);

        return result;
    }

}
