package org.animals;

public class Main {
	public static void main(String[] args) {
		
		//istaniamo alcuni animali
		//cani
		Dog dog1 = new Dog();
		//passerotti
		Sparrow sparrow1 = new Sparrow();
		//aquile
		Eagle eagle = new Eagle();
		//delfini
		Dolphin willy = new Dolphin();
		
		//test metodi
		System.out.println("Dog");
		dog1.sleep();
		dog1.eat();
		dog1.verse();
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
		
		
		//***********************
		faiVolare(sparrow1);
		faiVolare(eagle);
		faiNuotare(willy);
	}
	
	//-----------------------------------------------------------------------
	static void faiVolare(IVolante animale) {
		animale.fly();
	}
	
	static void faiNuotare(INuotante animale) {
		animale.swimming();
	}
}
