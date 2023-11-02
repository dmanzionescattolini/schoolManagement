package com.binaryLogicIT.schoolManagement.service;


import com.binaryLogicIT.schoolManagement.dto.StudentDto;
import com.binaryLogicIT.schoolManagement.entity.Course;
import com.binaryLogicIT.schoolManagement.entity.Student;
import com.binaryLogicIT.schoolManagement.entity.StudentCourse;
import com.binaryLogicIT.schoolManagement.repository.CourseRepository;
import com.binaryLogicIT.schoolManagement.repository.StudentCourseRepository;
import com.binaryLogicIT.schoolManagement.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;


    @Autowired
    private CourseRepository courseRepository;
    @Autowired
    private StudentCourseRepository studentCourseRepository;

    public List<StudentDto> getAllStudents(){
            List< Student> students = studentRepository.findAll();
            List<StudentDto> studentDtos = new ArrayList<>();
            students.forEach(student -> {
                StudentDto studentDto = new StudentDto();
                studentDto.setStudentName(student.getStudentName());
                studentDto.setStudentLastName(student.getStudentLastName());
                studentDto.setStudentEmail(student.getStudentEmail());
                List<StudentCourse> registrations = studentCourseRepository.findAllByStudentStudentId(student.getStudentId());
                List<String> coursesRegistered = registrations.stream().map(registration->
                    courseRepository.findById(registration.getCourse().getCourseId()).orElseThrow().getCourseName()
                ).toList();

                studentDto.setCourses(coursesRegistered);


                studentDtos.add(studentDto);
            });
            return studentDtos;
    }
    public void enrollInCourse(Integer studentId, Integer courseId){
        StudentCourse registration = new StudentCourse();
        registration.setCourse(courseRepository.findById(courseId).orElseThrow());
        registration.setStudent(studentRepository.findById(studentId).orElseThrow());
        studentCourseRepository.save(registration);

    }
}
