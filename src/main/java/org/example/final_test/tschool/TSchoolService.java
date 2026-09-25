package org.example.final_test.tschool;
import org.example.final_test.student.StudentService;
import org.example.final_test.student.controller.StudentController;
import org.example.final_test.student.dto.StudentDto;
import org.example.final_test.student.repository.StudentRepository;

public class TSchoolService {

    private final StudentRepository studentRepository;
    private final StudentService studentService;
    private final StudentController studentController;
    private final StudentDto studentDto;

    public TSchoolService(
            StudentRepository studentRepository,
            StudentService studentService,
            StudentController studentController,
            StudentDto studentDto
    ) {
        this.studentRepository = studentRepository;
        this.studentService = studentService;
        this.studentController = studentController;
      this.studentDto = studentDto;
    }
}
