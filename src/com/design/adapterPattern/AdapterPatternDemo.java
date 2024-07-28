package com.design.adapterPattern;

import java.util.ArrayList;

import com.design.factoryPattern.*;

public class AdapterPatternDemo {
	
	public static void main(String args[]) {
		Cow cow=new Cow();
		Cat cat=new Cat();
		Dog dog=new Dog();
		
		Animal cowAdaptor=new CowAdaptor(cow);
		Animal dogAdaptor=new DogAdaptor(dog);
		Animal catAdaptor=new CatAdaptor(cat);
		
		ArrayList<Animal> animals=new ArrayList<>();
		animals.add(cowAdaptor);
		animals.add(catAdaptor);
		animals.add(dogAdaptor);
		
		animals.forEach(animal->animal.makeSound());	
	}
}
