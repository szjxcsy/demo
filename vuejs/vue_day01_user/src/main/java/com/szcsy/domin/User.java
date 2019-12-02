package com.szcsy.domin;

import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.io.Serializable;


@Entity  //表示当前类是实体类
@Table(name = "user")  //表示实体类名和表名的映射(如果实体类和表名相同,可以省略)
public class User implements Serializable {


    @Id   //表示该字段是主键Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  //表示该主键是自增长
    @Column(name = "id")  //表示实体属性名和表中列名的映射 (如果实体类属性和表中列名相同,可以省略)
    private Integer id;
    private String username;
    private String password;
    private String sex;
    private int age;
    private String email;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }
}
