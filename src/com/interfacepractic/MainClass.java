package com.interfacepractic;

public class MainClass {
	public static void main(String[] args) {
		APhone aphone = new APhone();
		BPhone bphone = new BPhone();
		CPhone cphone = new CPhone();

		System.out.println("A Phone");
		aphone.getCall(true);
		aphone.call(false);
		aphone.connectSpeed(3);
		aphone.tvRemoteFunction(false);

		System.out.println("B Phone");
		bphone.getCall(true);
		bphone.call(true);
		bphone.connectSpeed(5);
		bphone.tvRemoteFunction(true);

		System.out.println("C Phone");
		cphone.getCall(true);
		cphone.call(false);
		cphone.connectSpeed(4);
		cphone.tvRemoteFunction(false);
	}
}
