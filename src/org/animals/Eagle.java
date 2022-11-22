package org.animals;

//la classe Eagle estende la classe astratta Animal
public class Eagle extends Animal implements IVolante{

	@Override
	public void sleep() {
		System.out.println("Zzzz Zzzzzz Zzzzzzz");
	}

	@Override
	public void verse() {
		System.out.println("Aaahh Aaahh");
	}

	@Override
	public void eat() {
		System.out.println("L'aquila si nutre per il 70-80% di mammiferi");
	}

	@Override
	public void fly() {
		System.out.println("Sto volando!!!");
	}

}
