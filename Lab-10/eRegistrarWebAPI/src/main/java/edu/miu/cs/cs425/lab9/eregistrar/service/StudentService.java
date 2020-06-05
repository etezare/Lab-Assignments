package edu.miu.cs.cs425.lab9.eregistrar.service;


import edu.miu.cs.cs425.lab9.eregistrar.model.Student;

import java.util.List;

public interface StudentService {

    public abstract List<Student> getAllStudents();
    public abstract Student saveStudent(Student student);
    public abstract Student getStudentById(Long studentId);
    public abstract void deleteStudentById(Long StudentId);
    public Student updateStudent(Student editedStudent, Long studentId);


}
