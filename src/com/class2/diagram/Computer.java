package com.class2.diagram;

public class Computer {
	private Cpu cpu;
	private MainBoard mb;
	
	public Computer() {
		this.cpu = new Cpu();
		this.mb = new MainBoard();
	}
}
