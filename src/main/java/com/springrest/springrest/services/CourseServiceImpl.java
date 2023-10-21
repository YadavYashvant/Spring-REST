package com.springrest.springrest.services;

import com.springrest.springrest.dao.CourseDao;
import com.springrest.springrest.entities.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseDao courseDao;


    //List<Course> list;

    public CourseServiceImpl() {
        /*list = new ArrayList<>();
        list.add(new Course(100, "Android developement Course", "this is a basic course for android enthusiasts to learn more about how to develope android apps with ease."));
        list.add(new Course(200, "MERN Stack web developement Course", "A course related to learning full stack web developement with the help of MongoDB, ExpressJs, ReactJs and NodeJs."));*/
    }
    @Override
    public List<Course> getCourses() {
        return courseDao.findAll();
    }

    @Override
    public Course getCourse(long courseId) {
        Course c = null;
        /*for(Course course: list) {
            if(course.getId() == courseId) {
                c = course;
                break;
            }
        }*/

        return courseDao.getById(courseId);
    }

    @Override
    public Course addCourse(Course course) {
        //list.add(course);
        courseDao.save(course);
        return course;
    }

    @Override
    public Course updateCourse(Course course) {
        /*list.forEach(e -> {
            if(e.getId() == course.getId()) {
                e.setTitle(course.getTitle());
                e.setDescription(course.getDescription());
            }
        });*/
        courseDao.save(course);
        return course;
    }

    @Override
    public void deleteCourse(long parseLong) {
        //list = this.list.stream().filter(e->e.getId()!=parseLong).collect(Collectors.toList());
        Course entity = courseDao.getById(parseLong);
        courseDao.delete(entity);
    }


}
