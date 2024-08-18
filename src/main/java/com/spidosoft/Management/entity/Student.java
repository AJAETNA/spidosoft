package com.spidosoft.Management.entity;
import java.util.*;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "student_master")
public class Student {
	
	@Id
	@Column(name = "student_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int stuId;
	
	@Column(name = "student_name")
	private String studentName;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "mobile_no")
	private String mobileNo;
	
	@Column (name = "marks")
	private int marks;
	
	@OneToMany(mappedBy = "student")
	List<StudentCourse> studentCourses = new ArrayList<>();

	public Student() {
		super();
	}

	public Student(String studentName, String address, String mobileNumber, int marks) {
		super();
		this.studentName = studentName;
		this.address = address;
		this.mobileNo = mobileNumber;
		this.marks = marks;
	}

	public int getStuId() {
		return stuId;
	}

	public void setStuId(int stuId) {
		this.stuId = stuId;
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

	public List<StudentCourse> getStudentCourses() {
		return studentCourses;
	}

	public void setStudentCourses(List<StudentCourse> studentCourses) {
		this.studentCourses = studentCourses;
	}
	
	
	
	
	
}
