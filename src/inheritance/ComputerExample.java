package inheritance;

public class ComputerExample {
	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		System.out.println(calc.calculatorArea(10));
		
		Computer comp = new Computer();
		System.out.println(comp.calculatorArea(10));
	}
}
