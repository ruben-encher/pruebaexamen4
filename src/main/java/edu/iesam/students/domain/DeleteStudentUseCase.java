package edu.iesam.students.domain;

public class DeleteStudentUseCase {

    StudentRepository studentRepository;

    public DeleteStudentUseCase(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public void delete(String id) {
        studentRepository.delete(id);
    }
}
