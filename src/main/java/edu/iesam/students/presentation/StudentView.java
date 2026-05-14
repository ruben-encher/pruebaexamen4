package edu.iesam.students.presentation;

import edu.iesam.students.data.StudentDataRepository;
import edu.iesam.students.data.StudentsMemLocalDataSource;
import edu.iesam.students.domain.AddStudentUseCase;
import edu.iesam.students.domain.Student;

public class StudentView {

    public static void add() {

        AddStudentUseCase addStudentUseCase = new AddStudentUseCase(new StudentDataRepository(StudentsMemLocalDataSource.newInstance()));

        Student student = new Student("1", "Ruben");
        addStudentUseCase.add(student);
    }
 }
