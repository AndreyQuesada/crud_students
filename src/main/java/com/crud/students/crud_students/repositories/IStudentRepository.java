package com.crud.students.crud_students.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crud.students.crud_students.models.StudentModel;

@Repository
public interface IStudentRepository extends JpaRepository<StudentModel, Long>{

  
} 
