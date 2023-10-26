package com.binaryLogicIT.schoolManagement.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@RepositoryRestResource
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id", nullable = false)
    private Integer studentId;

    @NotNull

    private String studentName;

    @NotNull
    private String studentLastName;

    @Email
    @NotNull
    private String studentEmail;

    @JoinTable(name = "Student_course",
            joinColumns = @JoinColumn(name = "student_id"),
            inverseJoinColumns = @JoinColumn(name = "course_id"))
    @ManyToMany
    private List<Course> courses;


}