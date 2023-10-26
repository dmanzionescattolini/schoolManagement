package com.binaryLogicIT.schoolManagement.repository;

import com.binaryLogicIT.schoolManagement.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}