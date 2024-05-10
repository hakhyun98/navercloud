package abstractclass;

public class Dog extends Animal{
	
	public Dog() {
		this.kind = kind;
	}
	
	@Override
	public void sound() {
		System.out.println("멍멍~");
	}
}
