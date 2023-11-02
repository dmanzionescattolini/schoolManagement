package com.binaryLogicIT.schoolManagement;

import com.binaryLogicIT.schoolManagement.entity.*;
import com.binaryLogicIT.schoolManagement.repository.CourseRepository;
import com.binaryLogicIT.schoolManagement.repository.InstructorRepository;
import com.binaryLogicIT.schoolManagement.repository.StudentCourseRepository;
import com.binaryLogicIT.schoolManagement.repository.StudentRepository;
import com.github.javafaker.Faker;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.*;

@SpringBootApplication
public class SchoolManagementApplication implements ApplicationRunner {
	@Autowired
	StudentRepository studentRepository;
	@Autowired
	InstructorRepository instructorRepository;

	@Autowired
	StudentCourseRepository studentCourseRepository;
	@Autowired
	CourseRepository courseRepository;


	public static void main(String[] args) {
		SpringApplication.run(SchoolManagementApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
//		Faker faker = new Faker();
//		Student student;
//		Instructor instructor;
//		Course course;
//
//
//			for (int i = 0; i < 4500; i++) {
//
//
//				student = new Student();
//				student.setStudentEmail(faker.internet().emailAddress());
//				student.setStudentName(faker.name().firstName());
//				student.setStudentLastName(faker.name().lastName());
//				studentRepository.save(student);
//			}
//
//			for(int i = 0;i<30;i++) {
//				instructor = new Instructor();
//				instructor.setInstructorName(faker.name().fullName());
//				instructorRepository.save(instructor);
//
//
//			}
//			for(int i = 0;i<90;i++) {
//				course = new Course();
//				course.setCourseName(faker.educator().course().toString());
//				int size = instructorRepository.findAll().size();
//
//				courseRepository.save(course);
//
//			}
//		List<Course> courses = courseRepository.findAll();
//		List<Instructor> instructors = instructorRepository.findAll();
//		List<Student> students = studentRepository.findAll();
//			for(Instructor i : instructors){
//
//				for(int j = 0;j<3;j++) {
//					Course c = courses.remove(0);
//					c.setInstructor(i);
//					courseRepository.save(c);
//				}
//
//
//			}

//		for(Course c : courses){
//
//				for(int i = 0;i<50;i++){
//					StudentCourse studentCourse = new StudentCourse();
//					Student s = students.remove(0);
//					studentCourse.setStudent(s);
//					studentCourse.setCourse(c);
//
//					studentCourseRepository.save(studentCourse);
//
//
//
//				}
//
//			}
//
//
//
//
//	}
	}
}
