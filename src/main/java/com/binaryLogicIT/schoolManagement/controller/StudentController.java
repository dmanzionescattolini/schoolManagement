package com.binaryLogicIT.schoolManagement.controller;

import com.binaryLogicIT.schoolManagement.entity.Student;
import com.binaryLogicIT.schoolManagement.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/students")
public class StudentController {

    @Autowired
    StudentRepository studentRepository;
    @GetMapping({"/",""})
    public ResponseEntity<List<Student>> getAllStudents(){
        return ResponseEntity.ok(studentRepository.findAll());
    }

}
