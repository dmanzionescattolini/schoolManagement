package com.binaryLogicIT.schoolManagement.service;

import com.binaryLogicIT.schoolManagement.dto.InstructorDto;
import com.binaryLogicIT.schoolManagement.entity.Course;
import com.binaryLogicIT.schoolManagement.entity.Instructor;
import com.binaryLogicIT.schoolManagement.repository.CourseRepository;
import com.binaryLogicIT.schoolManagement.repository.InstructorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class InstructorService {
    @Autowired
    InstructorRepository instructorRepository;

    @Autowired
    CourseRepository courseRepository;
    public List<InstructorDto> getAllInstructors(){
        List<Instructor> instructors =  instructorRepository.findAll();
        List<InstructorDto> instructorDTOS = new ArrayList<>();
        instructors.forEach(inst->{
            InstructorDto instructorDTO = new InstructorDto();
            instructorDTO.setInstructorName(inst.getInstructorName());

            instructorDTO.setCourses(courseRepository.findAllByInstructorInstructorId(inst.getInstructorId()).stream().map(Course::getCourseName).toList());
            instructorDTOS.add(instructorDTO);


        });
        return instructorDTOS;
    }

}
