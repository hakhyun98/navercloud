package com.class2.diagram;

public class Phone {
	private static Phone homePhone;
	private static Phone officePhone;

	private Phone() {
		homePhone = new Phone();
		officePhone = new Phone();
	}

	public static Phone getPhones(int i) {
		if (i == 1) {
			return homePhone;
		} else if (i == 2) {
			return officePhone;
		}
		return null;
	}
}
