package com.binaryLogicIT.schoolManagement.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@Getter
@Setter
@Entity
@Table(name = "course")
@NoArgsConstructor
@AllArgsConstructor
@RepositoryRestResource
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "course_id", nullable = false)
    private Integer id;

    @Column(name="course_name")
    private String courseName;

    @Column(name="instructor_id")

    private Integer instructorId;
}