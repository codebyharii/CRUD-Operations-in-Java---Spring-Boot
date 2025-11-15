package com.hari.webdemo.Controller;

import com.hari.webdemo.dto.Student;
import com.hari.webdemo.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentService service;

    @GetMapping("/getAll")
    public List<Student> getAllStudents() {
        System.out.println("controller running....");
        return service.getAllStudents();
    }
    @DeleteMapping("/{id}")
    public void deleteStudentById(@PathVariable int id){

        System.out.println("Student id "+ id);

        service.deleteStudentById(id);
    }
    @PostMapping("/save")
    public Student inserData(@RequestBody Student student) {
        System.out.println(student);
        service.saveStudent(student);
        return student;
    }

}
