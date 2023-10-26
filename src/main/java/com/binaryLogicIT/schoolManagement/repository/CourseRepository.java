package com.binaryLogicIT.schoolManagement.repository;

import com.binaryLogicIT.schoolManagement.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Integer> {
}