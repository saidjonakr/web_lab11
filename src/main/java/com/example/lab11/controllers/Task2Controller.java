package com.example.lab11.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
public class Task2Controller {
    
    @GetMapping("/greet/{name}")
    public String greet(@PathVariable String name) {
        return "Hello, " + name + "!";
    }

    @GetMapping("/square/{num}")
    public String square(@PathVariable int num) {
        return "The square of " + num + " is " + (num * num) + ".";
    }

    @GetMapping("/double/{num}")
    public String doubleNumber(@PathVariable int num) {
        return "Twice the value of " + num + " is " + (num * 2) + ".";
    }

    @GetMapping("/length/{text}")
    public String textLength(@PathVariable String text) {
        return "The length of '" + text + "' is " + text.length() + " characters.";
    }

    @GetMapping("/reverse/{text}")
    public String reverseText(@PathVariable String text) {
        return "The reverse of '" + text + "' is '" + new StringBuilder(text).reverse().toString() + "'.";
    }

    @GetMapping("/concat/{str1}/{str2}")
    public String concatenateStrings(@PathVariable String str1, @PathVariable String str2) {
        return "The concatenation of '" + str1 + "' and '" + str2 + "' is '" + str1 + str2 + "'.";
    }
}
