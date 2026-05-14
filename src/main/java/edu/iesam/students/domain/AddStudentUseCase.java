package edu.iesam.students.domain;

import edu.iesam.students.data.StudentsMemLocalDataSource;

public class AddStudentUseCase {

    StudentRepository studentRepository;

    public AddStudentUseCase(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public void add(Student student) {
        studentRepository.add(student);
    }
}
