package org.example.final_test.teacher;

import org.example.final_test.student.StudentService;
import org.example.final_test.student.dto.StudentDto;
import org.example.final_test.student.repository.StudentRepository;

public class TeacherService {
    private final StudentRepository studentRepository;
    private final StudentDto studentDto;
    private final StudentService studentService;

    public TeacherService(StudentRepository studentRepository, StudentDto studentDto, StudentService studentService) {
        this.studentRepository = studentRepository;
        this.studentDto = studentDto;
        this.studentService = studentService;
    }

    public String getStudent() {
        return studentRepository.findStudent();
    }
}
