package com.design.factoryPattern;

public class AnimalFactory {
	
	public static Animal createAnimal(String animalType) {
		
		switch(animalType.toUpperCase()) {
		case "CAT":
			return new CatAdaptor(new Cat());
		case "DOG":
			return new DogAdaptor(new Dog());
		case "COW":
			return new CowAdaptor(new Cow());
		default:
			throw  new IllegalArgumentException("Unknown animal type: "+animalType);
		}
		
	}

}
