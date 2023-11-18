package com.upskill.java_5;

public class InterfaceImplementation implements Interface {
	
	@Override
	public void iDoor() {
		System.out.println("My Car has 4 door");
	}

	@Override
	public int iWheel() {
		System.out.println("My Car has 4 Wheel");
		return 4;
	}

	@Override
	public void iColor() {
		System.out.println("My Car is RED");
	}

	@Override
	public String iEngine() {
		System.out.println("My Car has dual motor engine");
		return "Dual Motor";
	}

}
