package study.ex.com;

public class Advanced_for {
	public static void main(String[] args) {
		int[] scores = { 10, 20, 30, 40, 50, 60, 70 };

		int sum = 0;

		for (int score : scores) {
			sum += score;
		}
		System.out.println("점수 합 : " + sum);

		double avg = (double) sum / scores.length;
		System.out.println("점수 평균 : " + avg);
	}
}
