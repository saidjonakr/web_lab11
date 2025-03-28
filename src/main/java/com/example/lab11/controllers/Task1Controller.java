package com.example.lab11.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
public class Task1Controller {
    
    @GetMapping("/home")
    public String home() {
        return "Welcome to Home Page!";
    }

    @GetMapping("/services")
    public String services() {
        return "<h2>Our Services</h2>" + 
               "<ul>" + 
               "<li>Web Development</li>" + 
               "<li>Mobile App Development</li>" + 
               "<li>SEO Optimization</li>" + 
               "</ul>";
    }

    @GetMapping("/about")
    public String about() {
        return "This is a web application for managing various services and information.";
    }

    @GetMapping("/faq")
    public String faq() {
        return "<h2>Frequently Asked Questions</h2>" + 
               "<ul>" + 
               "<li>How do I contact support?</li>" + 
               "<li>What are your business hours?</li>" + 
               "<li>Do you offer refunds?</li>" + 
               "</ul>";
    }

    @GetMapping("/contact-us")
    public String contactUs() {
        return "<h2>Contact Information</h2>" + 
               "<p>Email: contact@example.com</p>" + 
               "<p>Phone: 123-456-7890</p>";
    }

    @GetMapping("/team")
    public String team() {
        return "<h2>Our Team</h2>" + 
               "<ul>" + 
               "<li>John Doe - CEO</li>" + 
               "<li>Jane Smith - CTO</li>" + 
               "<li>Mike Johnson - Developer</li>" + 
               "</ul>";
    }
}
