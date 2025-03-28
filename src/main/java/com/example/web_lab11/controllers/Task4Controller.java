package com.example.lab11.controllers;

import com.example.lab11.entities.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/entities")
public class Task4Controller {

    private Student student = new Student("Ali", 21);
    private Teacher teacher = new Teacher("Dr. Smith", "Computer Science");
    private Course course = new Course("Web Development", 12);
    private Book book = new Book("Clean Code", "Robert Martin", 39.99);

    @GetMapping("/student")
    public String getStudent() {
        return student.toString();
    }

    @GetMapping("/is-adult/{age}")
    public String isAdult(@PathVariable int age) {
        return age >= 18 ? 
            "Age " + age + ": You are an adult." : 
            "Age " + age + ": You are not an adult.";
    }

    @GetMapping("/teacher")
    public String getTeacher() {
        return teacher.toString();
    }

    @GetMapping("/course")
    public String getCourse() {
        return course.toString();
    }

    @PostMapping("/update-student-age/{age}")
    public String updateStudentAge(@PathVariable int age) {
        student.setAge(age);
        return "Student age updated to " + age;
    }

    @GetMapping("/book")
    public String getBook() {
        return book.toString();
    }
}
