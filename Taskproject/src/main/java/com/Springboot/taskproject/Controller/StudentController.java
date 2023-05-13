package com.Springboot.taskproject.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.Springboot.taskproject.bean.Student;
import com.Springboot.taskproject.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	public StudentService studentService;
	
	@RequestMapping("/students")
	public List<Student> getAllStudents(){
		return studentService.getAllStudents();
	}
	@RequestMapping(method = RequestMethod.POST,value="/students")
	public void addstudent(@RequestBody Student student) {
studentService.addstudent(student);		
	}
	@RequestMapping(method = RequestMethod.PUT,value="/students/{id}")
	public void updatestudent(@PathVariable String id,@RequestBody Student student) {
studentService.updatestudent(id,student);		
	}
	@RequestMapping(method = RequestMethod.DELETE,value="/students/{id}")
	public void deletestudent(@PathVariable String id,@RequestBody Student student) {
studentService.deletestudent(id);	
	}
}