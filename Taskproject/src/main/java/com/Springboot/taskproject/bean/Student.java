package com.Springboot.taskproject.bean;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "students")
public class Student {
	@Id
	private String id;
	private String username;

	

	
	public String getId() {
		return id;
	}

	
	public void setId(String id) {
		this.id = id;
	}

	
	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}

	public Student(String id, String username) {
		super();
		this.id = id;
		this.username = username;
	}

	public Student() {
		super();
	}

			
	
	
	

}
