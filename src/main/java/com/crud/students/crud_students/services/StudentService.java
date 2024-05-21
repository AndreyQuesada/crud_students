package com.crud.students.crud_students.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.students.crud_students.models.StudentModel;
import com.crud.students.crud_students.repositories.IStudentRepository;

@Service
public class StudentService {
  
  @Autowired
  IStudentRepository studentRepository;

  public ArrayList<StudentModel> getStudents(){
    return (ArrayList<StudentModel>) studentRepository.findAll();
  }

  public StudentModel saveStudent(StudentModel student){

    return studentRepository.save(student);
  }

  public Optional<StudentModel> getStudentById(Long id){
    return studentRepository.findById(id);
  }
}
