package com.assignment;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="studenttable")
public class Student {

	@Id
	int studentid;

	String studentname;

	int studentage;

	public int getStudentid() {
		return studentid;
	}

	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}

	public String getStudentname() {
		return studentname;
	}

	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}

	public int getStudentage() {
		return studentage;
	}

	public void setStudentage(int studentage) {
		this.studentage = studentage;
	}

	public Student(int studentid, String studentname, int studentage) {
		super();
		this.studentid = studentid;
		this.studentname = studentname;
		this.studentage = studentage;
	}

	public Student() {
		super();

	}

}
