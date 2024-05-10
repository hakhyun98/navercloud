package com.interfacepractic;

public class CPhone implements IFunction {

	@Override
	public void getCall(boolean isCall) {
		if (isCall) {
			System.out.println("전화 가능합니다.");
		} else {
			System.out.println("전화 불가능합니다.");
		}
	}

	@Override
	public void call(boolean isCall) {
		if (isCall) {
			System.out.print("가능합니다. ");
		} else {
			System.out.print("불가능합니다. ");
		}
	}

	@Override
	public void connectSpeed(int speed) {
		System.out.println(speed + "G입니다.");
	}

	@Override
	public void tvRemoteFunction(boolean isFunction) {
		if (isFunction) {
			System.out.println("탑재 되어있습니다.");
			System.out.println("---------------");
		} else {
			System.out.println("미탑재 되어 있습니다.");
			System.out.println("---------------");
		}
	}

}
