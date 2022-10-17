package oop_Inheritance;

public class Car extends Vehicle {

	int speed = 100;
	static final int wheels = 4;
	
	//final :
	//to prevent method overriding -- method final
	//to prevent inheritance -- class final
	//to provide constant data
	
	//private methods can not overriden
	
	public void start() {
		System.out.println("Car -- start");
	}
	
	public void stop() {
		System.out.println("Car -- stop");
	}
	
	public void refuel() {
		System.out.println("Car -- refuel");
	}
	
	public static void billing() {
		System.out.println("Car -- billing");
	}
	
}
