package com.design.factoryPattern;

public class CatAdaptor implements Animal{
	
	private Cat cat;
	
	public CatAdaptor(Cat cat) {
		this.cat=cat;
	}

	@Override
	public void makeSound() {
		cat.meaw();
	}

}
