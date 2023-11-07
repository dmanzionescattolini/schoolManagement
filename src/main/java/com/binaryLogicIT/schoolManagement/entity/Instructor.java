package com.binaryLogicIT.schoolManagement.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@Entity
@Table(name = "instructor")
@NoArgsConstructor
@AllArgsConstructor

public class Instructor implements
        Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "instructor_id", nullable = false)
    private Integer instructorId;

    @Column(name = "instructor_name")
    private String instructorName;


}