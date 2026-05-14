package edu.iesam.students.domain;

import java.util.ArrayList;

public class GetIdStudentUseCase {

    StudentRepository studentRepository;

    public GetIdStudentUseCase(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student getId(String id) {
        return studentRepository.getId(id);
    }
}
