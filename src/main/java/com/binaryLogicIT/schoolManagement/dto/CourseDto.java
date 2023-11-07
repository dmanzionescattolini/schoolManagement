package com.binaryLogicIT.schoolManagement.dto;

import lombok.Data;

import java.util.List;

@Data
public class CourseDto {

    private String courseName;
    private List<String> students;
    private String instructor;


}
