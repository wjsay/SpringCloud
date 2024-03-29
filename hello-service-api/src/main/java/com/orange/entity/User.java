package com.orange.entity;

/**
 * @author yu
 * @date 2021/3/2 10:54 下午
 **/
public class User {
    String name;
    Integer age;

    public User() {
    }

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "name = " + name + ", age = " + age;
    }
}
