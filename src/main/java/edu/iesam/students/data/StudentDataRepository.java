package edu.iesam.students.data;

import edu.iesam.students.domain.Student;
import edu.iesam.students.domain.StudentRepository;

public class StudentDataRepository implements StudentRepository {

    StudentsMemLocalDataSource studentsMemLocalDataSource;

    public StudentDataRepository(StudentsMemLocalDataSource studentsMemLocalDataSource) {
        this.studentsMemLocalDataSource = studentsMemLocalDataSource;
    }

    @Override
    public void add(Student student) {
        studentsMemLocalDataSource.add(student);
    }
}
