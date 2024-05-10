package lunch;

public class Student2 extends LunchMenu {
	
	public Student2(int banana, int milk, int almond) {
		super(banana,milk,almond);
	}
	@Override
	public int lunch() {
		return Price.RICE + Price.BULGOGI + Price.BANANA*banana + Price.MILK*milk + Price.ALMOND*almond;
	}
}
