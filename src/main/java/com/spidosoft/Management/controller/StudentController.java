package com.spidosoft.Management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spidosoft.Management.entity.Student;
import com.spidosoft.Management.pojo.StudentRequestBody;
import com.spidosoft.Management.service.StudentService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class StudentController {

	@Autowired 
	StudentService ser;
	
	@PostMapping("/addStudent")
	public String saveStudent(@RequestBody StudentRequestBody studentRequestBody) {
		String message = this.ser.addStudent(studentRequestBody);
		return message;
	}
	
	@GetMapping("/student")
	public List<Student> show(){
		return this.ser.getAllStudents();
	}
	
	@PutMapping("/updateStudent/{sId}")
	public String updateCompany(@PathVariable("sId")String s, @RequestBody StudentRequestBody studentRequestBody) {
		String message = this.ser.updateStudent(Integer.parseInt(s), studentRequestBody);
		return message;
	}

}
