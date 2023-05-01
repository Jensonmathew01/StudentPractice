package com.example.StudentPractice.Controller;

import com.example.StudentPractice.Model.Student;
import com.example.StudentPractice.Service.Studentservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class Studentcontroller {
    @Autowired
    private Studentservice studentservice;


    @PostMapping("/addstudent")
    public List<Student> addStudent(@RequestBody List<Student> student)
    {
      return studentservice.addStudent(student);
    }
    @GetMapping("/{courses}")
    public long getStudentByCourses(@RequestParam List<String> courses)
    {
        return studentservice.getStudentByCourses(courses);
    }
    @GetMapping("getaddress/{add}")
    public List<Student> getList(@PathVariable String add) {
        return studentservice.getAdd(add);
    }
    @GetMapping("/getall")
    public List<Student> getStudent()
    {
        return studentservice.getStudent();
    }

}
