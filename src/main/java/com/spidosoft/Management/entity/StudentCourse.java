package com.spidosoft.Management.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity(name = "studentdetails_master")
public class StudentCourse {
	
	@Id
	@Column(name="studentcourse_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sc_id;
	
	@ManyToOne
	@JoinColumn(name="student_id")
	@JsonIgnore
	private Student student;
	
	@ManyToOne
	@JoinColumn(name="course_id")
	@JsonIgnore
	private Course course;

	public StudentCourse() {
		super();
	}

	public StudentCourse(Student student, Course course) {
		super();
		this.student = student;
		this.course = course;
	}

	public int getSc_id() {
		return sc_id;
	}

	public void setSc_id(int sc_id) {
		this.sc_id = sc_id;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public Course getCourse() {
		return course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}
	
	@JsonProperty("course_id")
	public int getCourseId() {
		return this.course.getCid();
	}
	
	
	
	
}
