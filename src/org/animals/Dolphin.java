package org.animals;

//la classe Dolphin estende la classe astratta Animal
public class Dolphin extends Animal{

	@Override
	public void sleep() {
		System.out.println("Gluuuzzzz ..........");
	}

	@Override
	public void verse() {
		System.out.println("Iiiiihh IIiiihhh");
	}

	@Override
	public void eat() {
		System.out.println("Pesce, crostacei e calamari.");
	}

}
