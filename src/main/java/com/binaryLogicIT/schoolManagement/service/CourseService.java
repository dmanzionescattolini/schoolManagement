package com.binaryLogicIT.schoolManagement.service;

import com.binaryLogicIT.schoolManagement.dto.CourseDto;
import com.binaryLogicIT.schoolManagement.entity.Course;
import com.binaryLogicIT.schoolManagement.repository.CourseRepository;
import com.binaryLogicIT.schoolManagement.repository.StudentCourseRepository;
import com.binaryLogicIT.schoolManagement.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CourseService {
    @Autowired
    CourseRepository courseRepository;
    @Autowired
    StudentRepository studentRepository;
    @Autowired
    StudentCourseRepository studentCourseRepository;
    public List<CourseDto> getAllCourses(){
        List<Course> courses = courseRepository.findAll();
        List<CourseDto> courseDtos = new ArrayList<>();
        courses.forEach(course->{
            CourseDto courseDto = new CourseDto();
            courseDto.setCourseName(course.getCourseName());
            courseDto.setInstructor(course.getInstructor().getInstructorName());
            List<String> students = studentCourseRepository.findAllByCourseCourseId(course.getCourseId()).stream().map(registration->studentRepository.findById(registration.getStudent().getStudentId()).orElseThrow().toString()).toList();
            courseDto.setStudents(students);
            courseDtos.add(courseDto);
        });
        return courseDtos;

    }

}
