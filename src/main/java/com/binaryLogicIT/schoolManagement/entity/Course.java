package com.binaryLogicIT.schoolManagement.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "course")
@NoArgsConstructor
@AllArgsConstructor

public class Course implements Serializable {
    @OneToMany(mappedBy = "course")
    @Column(name = "students_registered")
    Set<StudentCourse> studentsRegistered;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "course_id", nullable = false)
    private Integer courseId;
    @Column(name = "course_name")
    private String courseName;
    @ManyToOne
    @JoinColumn(name = "instructor_instructor_id")
    private Instructor instructor;


}