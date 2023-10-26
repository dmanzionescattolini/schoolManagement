package com.binaryLogicIT.schoolManagement.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "instructor")
@NoArgsConstructor
@AllArgsConstructor
@RepositoryRestResource
public class Instructor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "instructor_id", nullable = false)
    private Integer instructorId;

    @NotNull
    @Column(name="instructor_name")
    private String instructorName;



    @Transient
    @OneToMany
    private List<Course> courses;

}