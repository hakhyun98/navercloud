package CodingProject;

public class StudentScoreReport {
	public static void maint(String[] args) {
		
		Student[] student = new Student[10];
		
		student[0] = new Student(null,100,70,80);
		student[1] = new Student(null,70,80,60);
		student[2] = new Student(null,80,70,70);
		student[3] = new Student(null,60,80,80);
		student[4] = new Student(null,50,60,70);
		student[5] = new Student(null,70,50,60);
		student[6] = new Student(null,90,90,50);
		student[7] = new Student(null,90,80,90);
		student[8] = new Student(null,80,70,80);
		student[9] = new Student(null,100,80,90);
		
		System.out.println("###Score Report###");
		System.out.println("국어 영어 수학 | 총합 평균");
		System.out.println("-----------------------------");
		
		for(Student score : student) {
			System.out.print(score.getKor()+" "+score.getEng()+" "+score.getMath()+" | "+score.add()+" "+score.avg());
			System.out.println(" ");
			
		}
	}
}
