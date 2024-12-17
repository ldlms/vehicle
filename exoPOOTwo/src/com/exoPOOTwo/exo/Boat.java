package com.exoPOOTwo.exo;

public class Boat extends Vehicle {

	public Boat(String brand, int kilometer) {
		super(brand, kilometer);
	}

	@Override
	public String doStuff() {
		return "Je suis un " + this.getBrand() + " et je fait glouglou \n";
	}
	
	

}
