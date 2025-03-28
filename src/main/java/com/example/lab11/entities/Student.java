package com.example.lab11.entities;

public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters and setters
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student: " + name + ", Age: " + age;
    }
}
