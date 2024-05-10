package com.class2.diagram;

public class Main {

	public static void main(String[] args) {
//		Student s1 = new Student("홍길동");
//		Student s2 = new Student("홍길서");
//		Student s3 = new Student("홍길남");
//
//		Course c1 = new Course("Software Engineering");
//		Course designPattern = new Course("Design Patter");
//
//		Transcript t1 = new Transcript(s1, c1);
//		t1.setGrade("A+");
//		Transcript t2 = new Transcript(s2, designPattern);
//		t2.setGrade("C+");
//		Transcript t3 = new Transcript(s3, designPattern);
//		t3.setGrade("C+");
//		
//		System.out.println(c1);
//		System.out.println(designPattern);
//		System.out.println(s1);
//		System.out.println(s2);
//		System.out.println(s3);
//		System.out.println(s1);
//		System.out.println(t1 + t1.getGrade());
//		System.out.println(t2 + t2.getGrade());
//		System.out.println(t3 + t3.getGrade());
		Washer wa = new Washer();
		Freeze fr = new Freeze();
		DishWasher dw = new DishWasher();
		
		wa.turnOn("Washer");
		fr.turnOn("Freeze");
		dw.turnOn("DishWasher");
	}

}
