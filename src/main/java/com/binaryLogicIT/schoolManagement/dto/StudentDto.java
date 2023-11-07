package com.binaryLogicIT.schoolManagement.dto;

import lombok.Data;

import java.util.List;

@Data
public class StudentDto {

    private String studentName;


    private String studentLastName;

    private String studentEmail;

    private List<String> courses;
}
