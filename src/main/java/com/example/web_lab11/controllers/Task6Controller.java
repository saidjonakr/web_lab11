package com.example.lab11.controllers;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api")
public class Task6Controller {

    @GetMapping("/student-info")
    public Map<String, Object> studentInfo() {
        return Map.of(
            "name", "Ali",
            "age", 21,
            "status", "active",
            "courses", List.of("CS101", "MATH202")
        );
    }

    @GetMapping("/course-info")
    public Map<String, Object> courseInfo() {
        return Map.of(
            "title", "Advanced Java",
            "description", "Spring Boot and Microservices",
            "duration", "8 weeks",
            "credits", 3
        );
    }

    @GetMapping("/user-profile")
    public Map<String, Object> userProfile() {
        return Map.of(
            "name", "Alice Smith",
            "email", "alice@example.com",
            "role", "Admin",
            "lastLogin", "2023-10-15"
        );
    }

    @GetMapping("/product-details")
    public Map<String, Object> productDetails() {
        return Map.of(
            "name", "Wireless Mouse",
            "category", "Electronics",
            "price", 29.99,
            "inStock", true
        );
    }

    @GetMapping("/order-summary")
    public Map<String, Object> orderSummary() {
        return Map.of(
            "orderId", "ORD-1001",
            "customer", "John Doe",
            "items", List.of(
                Map.of("product", "Laptop", "qty", 1, "price", 999.99),
                Map.of("product", "Mouse", "qty", 2, "price", 19.99)
            ),
            "total", 1039.97
        );
    }
}
