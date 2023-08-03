package com.oops.abs;

public class AnimalMain {

	public static void main(String[] args) {
		Animal animal=new Dog();
		animal.makesound();
		
		Dog dog=(Dog) animal;
		dog.play();
		
		animal=new Cat();
		animal.makesound();
		

		
	}

}
