package com.szcsy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @ClassName MyApplication
 * @Description TODO
 * @Author ly
 * @Company 深圳黑马程序员
 * @Date 2019/11/15 18:03
 * @Version V1.0
 */
@SpringBootApplication // 该注解放置到哪个类上，该类就是引导类
public class MyApplication {

    // 启动引导类
    public static void main(String[] args) {
        SpringApplication.run(MyApplication.class,args);
    }
}
