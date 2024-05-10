package com.class2.diagram;

//import java.util.Vector;

public class Transcript {
	
	private String data;
	private String grade;
	private Student students;
	private Course courses;
	
	public Transcript(Student student, Course course) {
		students = new Student(students.getName());
		courses = new Course(courses.getName());
	}
	public Student getStudent() {
		return students;
		
	}
	public Course getCourse() {
		return courses;
		
	}
	public void setData(String data) {
		this.data = data;
	}
	public String getData() {
		return data;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getGrade() {
		return grade;
	}
}
