package org.animals;

public class Main {
	public static void main(String[] args) {
		
		//istaniamo alcuni animali
		//cani
		Dog poyo = new Dog();
		Dog dog2 = new Dog();
		//passerotti
		Sparrow sparrow1 = new Sparrow();
		Sparrow sparrow2 = new Sparrow();
		Sparrow sparrow3 = new Sparrow();
		//aquile
		Eagle eagle = new Eagle();
		Eagle eagle2 = new Eagle();
		//delfini
		Dolphin willy = new Dolphin();
		
		//test metodi
		System.out.println("Dog");
		dog2.sleep();
		dog2.eat();
		dog2.verse();
		System.out.println("--------------");
		
		System.out.println("Sparrow");
		sparrow1.sleep();
		sparrow1.eat();
		sparrow1.verse();
		System.out.println("--------------");
		
		System.out.println("Eagle");
		eagle.sleep();
		eagle.eat();
		eagle.verse();
		System.out.println("--------------");
		
		System.out.println("Dolphin");
		willy.sleep();
		willy.eat();
		willy.verse();
		System.out.println("--------------");
		
	}
}
