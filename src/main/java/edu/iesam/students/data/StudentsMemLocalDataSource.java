package edu.iesam.students.data;

import edu.iesam.students.domain.Student;

import java.util.ArrayList;
import java.util.Objects;

public class StudentsMemLocalDataSource {

    private static StudentsMemLocalDataSource instance = null;

    private ArrayList<Student> storage = new ArrayList<>();

    public ArrayList<Student> findAll() {
        return storage;
    }

    public void add(Student student) {
        storage.add(student);
    }

    public void delete(String studentId) {
        storage.removeIf(carpeta -> Objects.equals(carpeta.getId(), studentId));
    }

    public Student findById(String id) {

        return storage.stream()
                .filter(s -> Objects.equals(s.getId(), id))
                .findFirst()
                .orElse(null);
    }

    public static StudentsMemLocalDataSource newInstance() {
        if (instance == null) {
            instance = new StudentsMemLocalDataSource();
        }
        return instance;
    }

}
