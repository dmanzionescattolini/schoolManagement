package com.binaryLogicIT.schoolManagement.repository;

import com.binaryLogicIT.schoolManagement.entity.StudentCourse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentCourseRepository extends JpaRepository<StudentCourse, Integer> {
    List<StudentCourse> findAllByStudentStudentId(Integer studentId);
    List<StudentCourse> findAllByCourseCourseId(Integer courseId);

}