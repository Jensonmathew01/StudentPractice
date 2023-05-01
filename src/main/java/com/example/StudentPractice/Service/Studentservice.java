package com.example.StudentPractice.Service;

import com.example.StudentPractice.Model.Student;

import com.example.StudentPractice.Model.Student$;
import com.example.StudentPractice.Repo.Studentrepo;
import com.speedment.jpastreamer.application.JPAStreamer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class Studentservice {

    @Autowired
    private Studentrepo studentrepo;

    @Autowired
    private JPAStreamer jpaStreamer;
    public List<Student> addStudent(List<Student> student) {
       return studentrepo.saveAll(student);
    }

    public long getStudentByCourses(List<String> course) {
        return jpaStreamer.stream(Student.class)
                .flatMap(student -> student.getCourses().stream())
                .filter(coursess -> course.contains(coursess))
                .distinct()
                .count();
    }

    public List<Student> getStudent() {
        return studentrepo.findAll();
    }

    public List<Student> getAdd(String add) {
        return jpaStreamer.stream(Student.class)
                .filter(Student$.address.equal(add))
                .collect(Collectors.toList());
    }
}

