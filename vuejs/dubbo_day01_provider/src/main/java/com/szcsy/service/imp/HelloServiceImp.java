package com.szcsy.service.imp;

import com.alibaba.dubbo.config.annotation.Service;
import com.szcsy.service.HelloService;


@Service
public class HelloServiceImp implements HelloService {

    @Override
    public String sayHello(String name) {


        System.out.println("服务的sayHello方法被调用"+name);

        return "Hello ="+name;
    }
}
