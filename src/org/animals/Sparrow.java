package org.animals;

//la classe Sparrow estende la classe astratta Animal
public class Sparrow extends Animal {

	@Override
	public void sleep() {
		System.out.println("Zzzz Zzzzzz Zzzzzzz");
	}

	@Override
	public void verse() {
		System.out.println("Cip Cip");
	}
	
	@Override
	public void eat() {
		System.out.println("il passerotto si nutre principalmente di cibo morbido ed insetti ");
	}

}
