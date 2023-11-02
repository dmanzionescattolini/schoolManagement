package com.binaryLogicIT.schoolManagement.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.*;
//import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor

public class Student implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "student_id", nullable = false)
    private Integer studentId;

    @NotNull
@Column(name="student_name")
    private String studentName;

    @NotNull
    @Column(name="student_last_name")
    private String studentLastName;

    @Email
    @NotNull
    @Column(name = "student_email")
    private String studentEmail;

    @OneToMany(mappedBy = "student")
            @Column(name="courses")
    Set<StudentCourse> courses;

    @Override
    public String toString() {
        return studentName + " " + studentLastName + "\n";
    }
}