package org.animals;

// la classe Dog estende la classe astratta Animal
public class Dog extends Animal {


	@Override
	public void verse() {
		System.out.println("Bau Bau");
	}

	@Override
	public void eat() {
		System.out.println("crocchette per cani");
	}

}
