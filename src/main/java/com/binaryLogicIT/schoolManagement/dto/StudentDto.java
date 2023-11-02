package com.binaryLogicIT.schoolManagement.dto;

import jakarta.persistence.Column;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.util.List;

@Data
public class StudentDto {

    private String studentName;


    private String studentLastName;

    private String studentEmail;

    private List<String> courses;
}
