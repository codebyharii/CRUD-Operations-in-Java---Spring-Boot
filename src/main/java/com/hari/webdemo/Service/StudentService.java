package com.hari.webdemo.Service;

import com.hari.webdemo.Repo.StudentRepo;
import com.hari.webdemo.dto.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class StudentService {

    @Autowired
    private StudentRepo repo;

    public List<Student> getAllStudents() {
        return repo.getAllStudent();
    }

    public Student saveStudent(Student student) {
        repo.saveStudent(student);  // use your custom repo method
        return student;
    }

    public void deleteStudentById(int id) {
        repo.deleteStudentById(id);
    }
}
