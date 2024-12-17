package com.exoPOOTwo.exo;

public class Hangar {

	public static void main(String[] args) {
		Car dacia = new Car("Dacia", 100);
		Boat zodiac = new Boat("zodiac",300);
		
		System.out.println(dacia.doStuff());
		System.out.println(zodiac.doStuff());

	}

}
