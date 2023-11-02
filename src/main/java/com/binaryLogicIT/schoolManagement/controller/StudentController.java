package com.binaryLogicIT.schoolManagement.controller;


import com.binaryLogicIT.schoolManagement.dto.StudentDto;
import com.binaryLogicIT.schoolManagement.entity.Student;
import com.binaryLogicIT.schoolManagement.repository.StudentRepository;
import com.binaryLogicIT.schoolManagement.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    StudentService studentService;
@CrossOrigin("*")
@GetMapping({"","/"})
    public ResponseEntity<List<StudentDto>> getAllStudents(){
        return ResponseEntity.ok(studentService.getAllStudents());
    }

    @PostMapping("/{studentId}/courses/{courseId}")
    public void enrollInCourse(@PathVariable("studentId") Integer studentId, @PathVariable("courseId") Integer courseId) {
        studentService.enrollInCourse(studentId, courseId);
    }
}
