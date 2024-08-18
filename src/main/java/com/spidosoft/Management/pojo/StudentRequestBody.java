package com.spidosoft.Management.pojo;

import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class StudentRequestBody {
	
	private String studentName;
	private String address;
	private String mobileNo;
	private int marks;
	private List<Integer> studentCourses;
	
	
	public StudentRequestBody() {
		super();
	}

	public StudentRequestBody(String studentName, String address, String mobileNo, int marks,
			List<Integer> studentCourses) {
		super();
		this.studentName = studentName;
		this.address = address;
		this.mobileNo = mobileNo;
		this.marks = marks;
		this.studentCourses = studentCourses;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}

	public int getMarks() {
		return marks;
	}

	public void setMarks(int marks) {
		this.marks = marks;
	}

	public List<Integer> getStudentCourses() {
		return studentCourses;
	}

	public void setStudentCourses(List<Integer> studentCourses) {
		this.studentCourses = studentCourses;
	}
	
	
	
	
	
}
