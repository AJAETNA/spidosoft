package com.spidosoft.Management.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spidosoft.Management.entity.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Integer> {

}
