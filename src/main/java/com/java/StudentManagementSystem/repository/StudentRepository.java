package com.java.StudentManagementSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.StudentManagementSystem.entity.Student;
public interface StudentRepository extends JpaRepository<Student, Long> {

}
