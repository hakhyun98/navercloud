package com.class2.diagram;

public class HomeAppliances {
	private int serialNo;
	private String manufacturer;
	private int year;
	
	private static HomeAppliances ha = new HomeAppliances();
	
	public HomeAppliances() {
	}
	
	public void setSerialNo(int serialNo) {
		this.serialNo = serialNo;
	}
	public int getSerialNo() {
		return serialNo;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getYear() {
		return year;
	}
	
	public void turnOn(String name) {
		System.out.println(name + "을 켭니다.");
	}
	public void turnOff(String name) {
		System.out.println(name + "을 끕니다.");
	}
}
