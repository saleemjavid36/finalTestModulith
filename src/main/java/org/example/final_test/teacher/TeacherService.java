package org.example.final_test.teacher;

import org.example.final_test.student.StudentService;

import org.example.final_test.student.repository.StudentRepository;

public class TeacherService {
    private final StudentRepository studentRepository;
    private final StudentService studentService;

    public TeacherService(StudentRepository studentRepository,  StudentService studentService) {
        this.studentRepository = studentRepository;
        this.studentService = studentService;
    }

    public String getStudent() {
        return studentRepository.findStudent();
    }
}



//import org.example.final_test.student.dto.StudentDto;
//    private final StudentDto studentDto;
