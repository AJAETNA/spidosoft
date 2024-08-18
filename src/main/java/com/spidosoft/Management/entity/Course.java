package com.spidosoft.Management.entity;

import java.util.*;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="course_master")
@JsonIgnoreProperties("studentCourses")
public class Course {
	
	@Id
	@Column(name="course_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cid;
	
	@Column(name="course_name")
	private String courseName;
	
	@Column(name="duration")
	private String duration;
	
	@OneToMany(mappedBy = "course")
	private List<StudentCourse> studentCourses = new ArrayList<>();

	public Course() {
		super();
	}

	public Course( String courseName, String duration) {
		super();
		this.courseName = courseName;
		this.duration = duration;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public List<StudentCourse> getStudentCourses() {
		return studentCourses;
	}

	public void setStudentCourses(List<StudentCourse> studentCourses) {
		this.studentCourses = studentCourses;
	}
	
	
	
}
