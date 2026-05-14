package edu.iesam.students.data;

import edu.iesam.students.domain.Student;
import edu.iesam.students.domain.StudentRepository;

import java.util.ArrayList;

public class StudentDataRepository implements StudentRepository {

    StudentsMemLocalDataSource studentsMemLocalDataSource;

    public StudentDataRepository(StudentsMemLocalDataSource studentsMemLocalDataSource) {
        this.studentsMemLocalDataSource = studentsMemLocalDataSource;
    }

    @Override
    public void add(Student student) {
        studentsMemLocalDataSource.add(student);
    }

    @Override
    public void delete(String id) {
        studentsMemLocalDataSource.delete(id);
    }

    @Override
    public ArrayList<Student> getAll() {
        return studentsMemLocalDataSource.findAll();
    }

    @Override
    public Student getId(String id) {
        return studentsMemLocalDataSource.findById(id);
    }
}
