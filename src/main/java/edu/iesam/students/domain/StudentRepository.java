package edu.iesam.students.domain;

import java.util.ArrayList;

public interface StudentRepository {


    void add(Student student);

    void delete(String id);

    ArrayList<Student> getAll();

    Student getId(String id);
}
