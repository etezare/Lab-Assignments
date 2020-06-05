package edu.miu.cs.cs425.lab9.eregistrar.controller;

import edu.miu.cs.cs425.lab9.eregistrar.model.Student;
import edu.miu.cs.cs425.lab9.eregistrar.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping(value = "/eregistrar/api/student", produces = MediaType.APPLICATION_JSON_VALUE)
public class StudentController {
    private StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {

        this.studentService = studentService;
    }

    @GetMapping(value = "/list")
    public List<Student> list() {
        return studentService.getAllStudents();
    }

    @GetMapping(value = "/get/{studentId}")
    public Student getStudentById(@PathVariable Long studentId) {
        return studentService.getStudentById(studentId);

    }
    @PostMapping(value="/register")
    public Student saveStudent(@Valid @RequestBody Student student){
         return    studentService.saveStudent(student);
    }
    @DeleteMapping(value = "/delete/{studentId}")
    public void deleteStudent(@PathVariable Long studentId){
         studentService.deleteStudentById(studentId);
    }

    @PutMapping(value = "/update/{studentId}")
    public Student updateStudent(@Valid @RequestBody Student editStudent,@PathVariable Long studentId){
        return studentService.updateStudent(editStudent,studentId);
    }

}

