package com.spidosoft.Management.service;

import java.util.List;

import com.spidosoft.Management.entity.Course;

public interface CourseService {
	
	public Course addCourse(Course course);
	public List<Course> getAllCourses();
	public Course updateStudent(Course course);
	public List<Course> getSpecificCourse(List<Integer> courseIdList);
}
