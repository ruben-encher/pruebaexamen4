package edu.iesam.students.mock;

import edu.iesam.students.domain.Student;
import edu.iesam.students.domain.StudentRepository;

import java.rmi.StubNotFoundException;
import java.util.ArrayList;

public class StudentMockRepository implements StudentRepository {

    public Integer countAddStudent = 0;
    public Integer countDeleteStudent = 0;

    @Override
    public void add(Student student) {
        countAddStudent++;
    }

    @Override
    public void delete(String id) {
        countDeleteStudent++;
    }

    @Override
    public ArrayList<Student> getAll() {

        ArrayList<Student> students = new ArrayList<>();
        Student student = new Student("1", "Ruben");
        Student student2 = new Student("2", "Ruben");

        students.add(student);
        students.add(student2);
        return students;
    }

    @Override
    public Student getId(String id) {
        return new Student("3","Pablo");
    }
}
