package com.spidosoft.Management.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spidosoft.Management.dao.CourseRepo;
import com.spidosoft.Management.entity.Course;

@Service
public class CourseServiceImpl implements CourseService{
	
	@Autowired
	CourseRepo couRepository;
	
	@Override
	public Course addCourse(Course course) {
		return this.couRepository.save(course);
	}

	@Override
	public List<Course> getAllCourses() {
		return this.couRepository.findAll();
	}

	@Override
	public Course updateStudent(Course course) {
		return this.couRepository.save(null);
	}

	@Override
	public List<Course> getSpecificCourse(List<Integer> courseIdList) {
		List<Course> courseList = new ArrayList<>();
		for(int i = 0; i < courseIdList.size(); i++){
			Optional<Course> course = this.couRepository.findById(courseIdList.get(i));
			Course c = course.get();
			courseList.add(c);
		}
		return courseList;
	}

}
