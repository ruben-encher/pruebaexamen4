package edu.iesam.students.domain;

import java.util.ArrayList;

public class GetStudentUseCase {

    StudentRepository studentRepository;

    public GetStudentUseCase(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public ArrayList<Student> getAll() {
        return studentRepository.getAll();
    }
}
