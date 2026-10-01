package com.example.StudentApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.StudentApp.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {}
