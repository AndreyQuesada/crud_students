package com.crud.students.crud_students.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.students.crud_students.models.StudentModel;
import com.crud.students.crud_students.services.StudentService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
@RequestMapping("/student")
public class StudentController {
  
  @Autowired
  private StudentService studentService;

  @GetMapping()
  public ArrayList<StudentModel> getStudents() {
      return this.studentService.getStudents();
  }

  @PostMapping()
  public StudentModel saveStudent(@RequestBody StudentModel student) {
      return this.studentService.saveStudent(student);
  }

  @GetMapping(path = "/{id}")
  public Optional<StudentModel> getStudentsById(@PathVariable Long id) {
      return this.studentService.getStudentById(id);
  }

  
  
}
