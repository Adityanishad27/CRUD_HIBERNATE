package com.mypack;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class students {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int StudentId;
	private String StudentName;
	private String StudentCity;
	private int studentage ;
	public int getStudentId() {
		return StudentId;
	}
	public void setStudentId(int studentId) {
		StudentId = studentId;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public String getStudentCity() {
		return StudentCity;
	}
	public void setStudentCity(String studentCity) {
		StudentCity = studentCity;
	}
	public int getStudentage() {
		return studentage;
	}
	public void setStudentage(int studentage) {
		this.studentage = studentage;
	}
	public students(int studentId, String studentName, String studentCity, int studentage) {
		super();
		StudentId = studentId;
		StudentName = studentName;
		StudentCity = studentCity;
		this.studentage = studentage;
	}
	@Override
	public String toString() {
		return "students [StudentId=" + StudentId + ", StudentName=" + StudentName + ", StudentCity=" + StudentCity
				+ ", studentage=" + studentage + "]";
	}
	public students() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	}
	
	
	
	
	
	
	
	


