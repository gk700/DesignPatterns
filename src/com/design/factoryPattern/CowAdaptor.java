package com.design.factoryPattern;

public class CowAdaptor implements Animal{
	
	private Cow cow;
	
	public CowAdaptor(Cow cow) {
		this.cow =cow;
		
	}

	@Override
	public void makeSound() {
		cow.boo();
	}
	

}
