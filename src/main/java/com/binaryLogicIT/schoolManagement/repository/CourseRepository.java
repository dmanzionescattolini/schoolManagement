package com.binaryLogicIT.schoolManagement.repository;

import com.binaryLogicIT.schoolManagement.entity.Course;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin("*")
@Repository
public interface CourseRepository extends ListCrudRepository<Course, Integer> {
    List<Course> findAllByInstructorInstructorId(Integer instructorId);
}