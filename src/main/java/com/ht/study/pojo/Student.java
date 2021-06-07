package com.ht.study.pojo;

import lombok.Data;

@Data
public class Student {

    private String name;
    private int age;
    private double money;

    public Student(String name, int age, double money) {
        this.name = name;
        this.age = age;
        this.money = money;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", money=" + money +
                '}';
    }
}
