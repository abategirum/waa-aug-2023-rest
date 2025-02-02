package com.example.demo.dto;


import com.example.demo.entitiy.Course;
import lombok.Data;

import java.util.List;

@Data
public class StudentDto {
    private int id;
    private String firstName;
    private String lastName;
    private String email;
    private String major;
    private List<CourseDto> courseTaken;
}
