package com.spidosoft.Management.service;

import java.util.List;

import com.spidosoft.Management.entity.Student;
import com.spidosoft.Management.pojo.StudentRequestBody;

public interface StudentService {
	
	public String addStudent(StudentRequestBody studentRequestBody);
	public List<Student> getAllStudents();
	public String updateStudent(int sId, StudentRequestBody studentRequestBody);
}
