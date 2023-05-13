package com.Springboot.taskproject.Repository;

import org.springframework.data.repository.CrudRepository;

import com.Springboot.taskproject.bean.Student;

public interface StudentRepository extends CrudRepository<Student, String> {

}