package com.binaryLogicIT.schoolManagement.controller;

import com.binaryLogicIT.schoolManagement.dto.CourseDto;
import com.binaryLogicIT.schoolManagement.entity.Course;
import com.binaryLogicIT.schoolManagement.repository.CourseRepository;
import com.binaryLogicIT.schoolManagement.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController {
    @Autowired
    CourseService courseService;
    @GetMapping({"/",""})
    @CrossOrigin("*")
    public ResponseEntity<List<CourseDto>> getAllCourses(){
        return ResponseEntity.ok(courseService.getAllCourses());
    }
}
