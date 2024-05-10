package com.class2.diagram;

import java.util.Vector;

public class Course {
	private String name;
	private Vector<Transcript> transcripts;

	public Course(String name) {
		this.name = name;
		transcripts = new Vector<Transcript>();
	}

	public void addTranscript(Transcript transcript) {
		transcripts.add(transcript);

	}

//	public void removeStudent(Student student) {
//		if (students.contains(student)) {
//			students.remove(student);
//		}
//	}
//
//	public Vector<Student> getStudents() {
//		return students;
//	}

	public String getName() {
		return name;
	}
}
