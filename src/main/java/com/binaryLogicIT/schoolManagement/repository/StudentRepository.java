package com.binaryLogicIT.schoolManagement.repository;

import com.binaryLogicIT.schoolManagement.entity.Student;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

@Repository
@CrossOrigin("*")
public interface StudentRepository extends ListCrudRepository<Student, Integer> {
}