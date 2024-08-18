package com.spidosoft.Management.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spidosoft.Management.entity.Course;

@Repository
public interface CourseRepo extends JpaRepository<Course, Integer>{

}
