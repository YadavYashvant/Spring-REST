package com.springrest.springrest.services;

import com.springrest.springrest.entities.Course;
import org.springframework.stereotype.Service;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {


    List<Course> list;

    public CourseServiceImpl() {
        list = new ArrayList<>();
        list.add(new Course(100, "Android developement Course", "this is a basic course for android enthusiasts to learn more about how to develope android apps with ease."));
        list.add(new Course(200, "MERN Stack web developement Course", "A course related to learning full stack web developement with the help of MongoDB, ExpressJs, ReactJs and NodeJs."));
    }
    @Override
    public List<Course> getCourses() {
        return list;
    }
}
