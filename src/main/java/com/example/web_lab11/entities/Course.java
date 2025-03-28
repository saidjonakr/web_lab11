package com.example.lab11.entities;

public class Course {
    private String title;
    private int durationWeeks;

    public Course(String title, int durationWeeks) {
        this.title = title;
        this.durationWeeks = durationWeeks;
    }

    @Override
    public String toString() {
        return "Course: " + title + " (" + durationWeeks + " weeks)";
    }
}
