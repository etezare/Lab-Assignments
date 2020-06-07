package edu.miu.cs.cs425.lab9.eregistrar.service.impl;

import edu.miu.cs.cs425.lab9.eregistrar.model.Student;
import edu.miu.cs.cs425.lab9.eregistrar.repository.StudentRepository;
import edu.miu.cs.cs425.lab9.eregistrar.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> getAllStudents() {
        return  studentRepository.findAll();
    }

    @Override
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }


    @Override
    public Student getStudentById(Long studentId) {
        return studentRepository.findById(studentId).orElse(null);
    }

    @Override
    public void deleteStudentById(Long studentId) {
        studentRepository.deleteById(studentId);
    }

    @Override
    public Student updateStudent(Student editedStudent, Long studentId) {
        return studentRepository.findById(studentId)
                .map(Student -> {
                    Student.setFirstName(editedStudent.getFirstName());
                    Student.setLastName(editedStudent.getLastName());
                    Student.setStudentNumber(editedStudent.getStudentNumber());
                    Student.setIsInternational(editedStudent.getIsInternational());
                    Student.setCgpa(editedStudent.getCgpa());
                    Student.setEnrollmentDate(editedStudent.getEnrollmentDate());


                    return studentRepository.save(Student);
                }).orElseGet(() -> {
                    return studentRepository.save(editedStudent);
                });
    }









}
