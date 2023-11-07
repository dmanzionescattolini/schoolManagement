package com.binaryLogicIT.schoolManagement.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Set;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor

public class Student   {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @OneToMany(mappedBy = "student")
    @Column(name = "courses")
    Set<StudentCourse> courses;

    private Integer studentId;
    @NotNull
    @Column(name = "student_name")
    private String studentName;
    @NotNull
    @Column(name = "student_last_name")
    private String studentLastName;
    @Email
    @NotNull
    @Column(name = "student_email")
    private String studentEmail;

    @Override
    public String toString() {
        return studentName + " " + studentLastName + "\n";
    }
}