package com.spidosoft.Management.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spidosoft.Management.entity.StudentCourse;

@Repository
public interface StudentDetailsRepo extends JpaRepository<StudentCourse, Integer> {

}
