package iostream;

import java.io.Serializable;

public class Product implements Serializable {
	private static final long serialVersionUID = -621812868470078544L;
	private int price;
	private String name;

	public Product(int price, String name) {
		this.price = price;
		this.name = name;
	}

	@Override
	public String toString() {
		return (name + ": " + price);
	}

}
