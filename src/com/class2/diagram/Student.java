package com.class2.diagram;

import java.util.Vector;

public class Student {
	private String name;
	private Vector<Transcript> transcripts;
	private Vector<Course> courses;

	public Student(String name) {
		this.name = name;
		transcripts = new Vector<Transcript>();
		courses = new Vector<Course>();
	}

	public void addTranscript(Transcript transcript) {
		transcripts.add(transcript);
	}

	public Vector<Course> getCourse() {
		return courses;
	}
	
	public String getName() {
		return name;
	}
}
