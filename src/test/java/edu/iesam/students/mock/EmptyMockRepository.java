package edu.iesam.students.mock;

import edu.iesam.students.domain.Student;
import edu.iesam.students.domain.StudentRepository;

import java.util.ArrayList;

public class EmptyMockRepository implements StudentRepository {
    @Override
    public void add(Student student) {

    }

    @Override
    public void delete(String id) {

    }

    @Override
    public ArrayList<Student> getAll() {
        return null;
    }

    @Override
    public Student getId(String id) {
        return null;
    }
}
