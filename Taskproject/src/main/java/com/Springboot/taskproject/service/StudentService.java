package com.Springboot.taskproject.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Springboot.taskproject.Repository.StudentRepository;
import com.Springboot.taskproject.bean.Student;

@Service
public class StudentService {
	@Autowired
	public StudentRepository studentRepository;
	
	public List<Student> getAllStudents(){
		List<Student> students=new ArrayList<>();
				studentRepository.findAll().forEach(students::add);
		return students;
	}
public void addstudent(Student student) {
	studentRepository.save(student);
}
public void updatestudent(String id,Student student) {
	studentRepository.save(student);
}
public void deletestudent(String id) {
	studentRepository.deleteById(id);
}
}