package lunch;

public abstract class LunchMenu {

	public int rice = 1;
	public int bulgogi = 1;
	public int banana;
	public int milk;
	public int almond;

	public LunchMenu(int banana, int milk, int almond) {
		this.banana = banana;
		this.milk = milk;
		this.almond = almond;
	}

	public LunchMenu() {
	}

	public abstract int lunch();

}