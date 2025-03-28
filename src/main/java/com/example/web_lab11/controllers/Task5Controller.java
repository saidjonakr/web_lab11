package com.example.lab11.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/query")
public class Task5Controller {

    @GetMapping("/greet")
    public String greet(
        @RequestParam(name = "name", defaultValue = "Guest") String name) {
        return "Hello, " + name + "!";
    }

    @GetMapping("/calculate")
    public String calculate(
        @RequestParam(name = "x") int x,
        @RequestParam(name = "y") int y,
        @RequestParam(name = "operation") String operation) {
        
        switch (operation.toLowerCase()) {
            case "add": return "Result: " + (x + y);
            case "subtract": return "Result: " + (x - y);
            case "multiply": return "Result: " + (x * y);
            case "divide": 
                if (y == 0) return "Cannot divide by zero!";
                return "Result: " + ((double)x / y);
            default: return "Invalid operation";
        }
    }

    @GetMapping("/filter")
    public String filter(
        @RequestParam(name = "keyword", defaultValue = "") String keyword,
        @RequestParam(name = "category", defaultValue = "all") String category) {
        return "Filtering by keyword: '" + keyword + "' in category: '" + category + "'";
    }

    @GetMapping("/convert")
    public String convert(
        @RequestParam(name = "temperature") double temperature) {
        double fahrenheit = (temperature * 9/5) + 32;
        return temperature + "°C = " + fahrenheit + "°F";
    }

    @GetMapping("/discount")
    public String discount(
        @RequestParam(name = "originalPrice") double price,
        @RequestParam(name = "discountRate") double rate) {
        double discount = price * (rate / 100);
        return String.format("Original: $%.2f | Discount: %.2f%% | Final: $%.2f",
            price, rate, price - discount);
    }
}
