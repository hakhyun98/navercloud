package lunch;

public class Student1 extends LunchMenu {
	public Student1(int banana, int milk, int almond) {
		super(banana,milk,almond);
	}
	@Override
	public int lunch() {
		return Price.RICE + Price.BULGOGI + Price.BANANA*banana + Price.MILK*milk + Price.ALMOND*almond;
	}
}
