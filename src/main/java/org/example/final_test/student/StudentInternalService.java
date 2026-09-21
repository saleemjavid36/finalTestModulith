package org.example.final_test.student;

import org.springframework.stereotype.Service;

@Service
public class StudentInternalService {
    public String getInternalStudentData() {
        return "Internal student data";
    }
}
