package com.binaryLogicIT.schoolManagement.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
//import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "course")
@NoArgsConstructor
@AllArgsConstructor

public class Course implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "course_id", nullable = false)
    private Integer courseId;

    @Column(name="course_name")
    private String courseName;


    @ManyToOne
    @JoinColumn(name = "instructor_instructor_id")
    private Instructor instructor;
    @OneToMany(mappedBy = "course")
     @Column(name="students_registered")
    Set<StudentCourse> studentsRegistered;


}