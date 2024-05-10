package constructor_prac;

public class This {
	public static void main(String[] args) {
		Car car = new Car();
		System.out.println("car.company : " + car.company);
		System.out.println("car.model : " + car.model + "\n");

		Car car1 = new Car("seltos");
		System.out.println("car1.company : " + car1.company);
		System.out.println("car1.model : " + car1.model);
		System.out.println("car1.color : " + car1.color + "\n");

		Car car2 = new Car("morning", "yellow");
		car2.company = "hyundai";
		car2.model = "casper";
		car2.maxSpeed = 10;
		System.out.println("car2.company : " + car2.company);
		System.out.println("car2.model : " + car2.model);
		System.out.println("car2.color : " + car2.color);
		System.out.println("car2.maxSpeed : " + car2.maxSpeed + "\n");

		Car car3 = new Car("mohavi", "red", 300);
		System.out.println("car3.company : " + car3.company);
		System.out.println("car3.model : " + car3.model);
		System.out.println("car3.color : " + car3.color);
		System.out.println("car3.maxSpeed : " + car3.maxSpeed);
	}
}
