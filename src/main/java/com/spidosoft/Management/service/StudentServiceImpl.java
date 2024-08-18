package com.spidosoft.Management.service;

import java.util.*;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spidosoft.Management.dao.CourseRepo;
import com.spidosoft.Management.dao.StudentDetailsRepo;
import com.spidosoft.Management.dao.StudentRepo;
import com.spidosoft.Management.entity.Course;
import com.spidosoft.Management.entity.Student;
import com.spidosoft.Management.entity.StudentCourse;
import com.spidosoft.Management.pojo.StudentRequestBody;

@Service
public class StudentServiceImpl implements StudentService {
	
	@Autowired
	StudentRepo stuRepo;
	
	@Autowired
	StudentDetailsRepo studentDetailRepo;
	
	@Autowired
	CourseRepo couRepo;

	@Override
	public String addStudent(StudentRequestBody studentRequestBody) {
		
		Student s = new Student(studentRequestBody.getStudentName(), studentRequestBody.getAddress(),
						studentRequestBody.getMobileNo(),studentRequestBody.getMarks());
		this.stuRepo.save(s);
		List<Integer> courseList = studentRequestBody.getStudentCourses();
		for(int i = 0; i < courseList.size(); i++) {
			Optional<Course> c = couRepo.findById(courseList.get(i));
			StudentCourse sc = new StudentCourse(s, c.get());
			this.studentDetailRepo.save(sc);
		}
		return "Student added successfully";
	}

	@Override
	public List<Student> getAllStudents() {
		return this.stuRepo.findAll();
	}

	@Override
	public String updateStudent(int sid, StudentRequestBody studentRequestBody) {
		Optional<Student> s = this.stuRepo.findById(sid);
		Student stu = s.get();
		stu.setStudentName(studentRequestBody.getStudentName());
		stu.setAddress(studentRequestBody.getAddress());
		stu.setMobileNo(studentRequestBody.getMobileNo());
		stu.setMarks(studentRequestBody.getMarks());
		this.stuRepo.save(stu);
		
		

		this.studentDetailRepo.deleteAll(stu.getStudentCourses());
		List<Integer> courseList = studentRequestBody.getStudentCourses();
		for(int i = 0; i < courseList.size(); i++) {
			Optional<Course> c = couRepo.findById(courseList.get(i));
			StudentCourse sc = new StudentCourse(stu, c.get());
			this.studentDetailRepo.save(sc);
		}

		return "Student Updated Successfully";
	}
}
