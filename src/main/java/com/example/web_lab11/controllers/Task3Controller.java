package com.example.lab11.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
public class Task3Controller {

    @GetMapping("/add/{x}/{y}")
    public String add(@PathVariable int x, @PathVariable int y) {
        return "The sum of " + x + " and " + y + " is " + (x + y) + ".";
    }

    @GetMapping("/multiply/{x}/{y}")
    public String multiply(@PathVariable int x, @PathVariable int y) {
        return "The product of " + x + " and " + y + " is " + (x * y) + ".";
    }

    @GetMapping("/subtract/{x}/{y}")
    public String subtract(@PathVariable int x, @PathVariable int y) {
        return "The difference between " + x + " and " + y + " is " + (x - y) + ".";
    }

    @GetMapping("/divide/{x}/{y}")
    public String divide(@PathVariable int x, @PathVariable int y) {
        if (y == 0) return "Cannot divide by zero!";
        return "The division of " + x + " by " + y + " is " + ((double)x / y) + ".";
    }

    @GetMapping("/modulus/{x}/{y}")
    public String modulus(@PathVariable int x, @PathVariable int y) {
        return "The remainder of " + x + " divided by " + y + " is " + (x % y) + ".";
    }

    @GetMapping("/power/{base}/{exp}")
    public String power(@PathVariable int base, @PathVariable int exp) {
        return base + " raised to the power of " + exp + " is " + Math.pow(base, exp) + ".";
    }
}
