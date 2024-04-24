package classPrac;

public class Main {
	public static void main(String[] args) {
		Car car = new Car();
		System.out.println("company : " + car.company);
		System.out.println("model : " + car.model);
		System.out.println("maxspeed : " + car.maxSpeed);
		System.out.println("door : " + car.door.name);
		System.out.println("home : " + Car.home);
		String[] myArray = car.arr;
		myArray[0] = "hi";
		System.out.println(myArray[0]);
		car.p();
	}
}
