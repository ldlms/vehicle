package com.exoPOOTwo.exo;

public class Car extends Vehicle {

	public Car(String brand, int kilometer) {
		super(brand, kilometer);
	}

	@Override
	public String doStuff() {
		return "Je suis une " + this.getBrand() + " et je fait vroum vroum \n";
	}

}
