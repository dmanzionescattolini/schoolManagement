package com.binaryLogicIT.schoolManagement.controller;

import com.binaryLogicIT.schoolManagement.dto.InstructorDto;
import com.binaryLogicIT.schoolManagement.service.InstructorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/instructors")
public class InstructorController {

    @Autowired
    InstructorService instructorService;

    @GetMapping({"/",""})
    @CrossOrigin("*")
    public ResponseEntity<List<InstructorDto>> getAllInstructors(){
        return ResponseEntity.ok(instructorService.getAllInstructors());
    }

}
