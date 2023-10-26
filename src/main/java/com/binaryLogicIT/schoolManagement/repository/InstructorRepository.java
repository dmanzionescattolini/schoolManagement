package com.binaryLogicIT.schoolManagement.repository;

import com.binaryLogicIT.schoolManagement.entity.Instructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface InstructorRepository extends JpaRepository<Instructor, Integer>{
}