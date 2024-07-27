package com.design.factoryPattern;

public class DogAdaptor implements Animal{
	
	private Dog dog;

	public DogAdaptor(Dog dog) {
		this.dog= dog;
	}

	@Override
	public void makeSound() {
		dog.bark();
	}
}
