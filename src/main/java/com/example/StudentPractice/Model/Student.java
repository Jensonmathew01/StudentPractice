package com.example.StudentPractice.Model;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    @Id
    @GeneratedValue
    private Integer id;
    private String studentid;
    private String name;
    private String email;
    private String phoneno;
    private String qualification;
    private String experience;
    @ElementCollection
    private List<String> courses;
    private String address;
    private String comment;


}
