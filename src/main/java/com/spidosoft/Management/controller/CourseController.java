package com.spidosoft.Management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spidosoft.Management.entity.Course;
import com.spidosoft.Management.service.CourseService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class CourseController {
	
	@Autowired
	CourseService ser;
	
	@PostMapping("/addCourse")
	public Course saveCourse(@RequestBody Course cou) {
		return this.ser.addCourse(cou);
	}
	
	@GetMapping("/courses")
	public List<Course> show(){
		return this.ser.getAllCourses();
	}
	
	@PutMapping("/updateCourse")
	public Course updateCourse(@RequestBody Course cou) {
		return this.ser.updateStudent(cou);
	}
	
	@PostMapping("/getSpecificCourse")
	public List<Course> getSpecificCourse(@RequestBody List<Integer> courseIdList){
		return this.ser.getSpecificCourse(courseIdList);
	}
}
