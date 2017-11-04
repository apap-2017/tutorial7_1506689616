package com.example.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.CourseMapper;
import com.example.model.CourseModel;

@Service
public class CourseServiceDatabase implements CourseService
{
    @Autowired
    private CourseMapper courseMapper;
    
    @Override
    public CourseModel selectCourse (String id)
    {
        return courseMapper.selectCourse (id);
    }
    
    @Override
    public List<CourseModel> selectAllCourses()
    {
    	List<CourseModel> courses = courseMapper.selectAllCourses();
    	return courses;
    }
}