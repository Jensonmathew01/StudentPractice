package com.example.StudentPractice.Repo;

import com.example.StudentPractice.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;


public interface Studentrepo extends JpaRepository<Student,String> {
}
