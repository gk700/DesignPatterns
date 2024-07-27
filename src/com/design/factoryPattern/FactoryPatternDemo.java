package com.design.factoryPattern;

import java.util.ArrayList;

public class FactoryPatternDemo {
	
	public static void main(String args[]) {
		
		Animal cat =AnimalFactory.createAnimal("CAT");
		Animal dog = AnimalFactory.createAnimal("DOG");
		Animal cow = AnimalFactory.createAnimal("COW");
		
		ArrayList<Animal> animals = new ArrayList<>();
		animals.add(cat);
		animals.add(cow);
		animals.add(dog);
		
		animals.forEach(Animal::makeSound);
	}

}
