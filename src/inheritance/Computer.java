package inheritance;

public class Computer extends Calculator {
	
	@Override
	public double calculatorArea(double r) {
		System.out.println("Computer Class");
		return Math.PI * r * r;
	}
}
