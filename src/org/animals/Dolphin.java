package org.animals;

//la classe Dolphin estende la classe astratta Animal
public class Dolphin extends Animal implements INuotante{

	@Override
	public void verse() {
		System.out.println("Iiiiihh IIiiihhh");
	}

	@Override
	public void eat() {
		System.out.println("Pesce, crostacei e calamari.");
	}

	@Override
	public void swimming() {
		System.out.println("Sto nuotando!!!");
	}

}
