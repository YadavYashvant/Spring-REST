package com.springrest.springrest.controller;

import com.springrest.springrest.entities.Course;
import com.springrest.springrest.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MyController {

    /*@GetMapping("/home")
    public String home() {
        return "this is home page";
    }*/

    // Get courses

    @Autowired
    private CourseService courseService;

    @GetMapping("/courses")
    public List<Course> getCourses() {
        return this.courseService.getCourses();
    }
}
