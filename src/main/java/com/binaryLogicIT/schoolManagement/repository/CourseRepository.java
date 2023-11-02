package com.binaryLogicIT.schoolManagement.repository;

import com.binaryLogicIT.schoolManagement.entity.Course;
import com.binaryLogicIT.schoolManagement.entity.Instructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.Collection;
import java.util.List;

@CrossOrigin("*")
@Repository
public interface CourseRepository extends ListCrudRepository<Course, Integer> {
    List<Course>  findAllByInstructorInstructorId(Integer instructorId);
}