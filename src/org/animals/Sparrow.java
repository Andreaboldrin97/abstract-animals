package org.animals;

//la classe Sparrow estende la classe astratta Animal
public class Sparrow extends Animal implements IVolante {

	@Override
	public void verse() {
		System.out.println("Cip Cip");
	}
	
	@Override
	public void eat() {
		System.out.println("il passerotto si nutre principalmente di cibo morbido ed insetti ");
	}

	@Override
	public void fly() {
		System.out.println("Sto volando!!!");
	}
}
