package com.binaryLogicIT.schoolManagement;

import com.binaryLogicIT.schoolManagement.entity.Course;
import com.binaryLogicIT.schoolManagement.entity.Instructor;
import com.binaryLogicIT.schoolManagement.entity.Student;
import com.binaryLogicIT.schoolManagement.repository.CourseRepository;
import com.binaryLogicIT.schoolManagement.repository.InstructorRepository;
import com.binaryLogicIT.schoolManagement.repository.StudentRepository;
import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SchoolManagementApplication implements ApplicationRunner {
	@Autowired
	StudentRepository studentRepository;
	@Autowired
	InstructorRepository instructorRepository;

	@Autowired
	CourseRepository courseRepository;
	public static void main(String[] args) {
		SpringApplication.run(SchoolManagementApplication.class, args);
	}

	@Override
	public void run(ApplicationArguments args) throws Exception {
		Faker faker = new Faker();
		Student student;
		Instructor instructor;
		Course course;
		if(studentRepository.findAll().isEmpty()) {

			for (int i = 0; i < 100; i++) {


				student = new Student();
				student.setStudentEmail(faker.internet().emailAddress());
				student.setStudentName(faker.name().firstName());
				student.setStudentLastName(faker.name().lastName());
				studentRepository.save(student);
			}
		}
		if(instructorRepository.findAll().isEmpty()) {
			instructor = new Instructor();
			instructor.setInstructorName(faker.name().fullName());
			instructorRepository.save(instructor);

		}
		if(courseRepository.findAll().isEmpty()){
			course= new Course();
			course.setCourseName(faker.educator().course().toString());
			course.setInstructorId(instructorRepository.findAll().stream().map(x->x.getInstructorId()).findAny().get());
			courseRepository.save(course);


		}
	}
}
