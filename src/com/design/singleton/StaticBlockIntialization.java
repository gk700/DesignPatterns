package com.design.singleton;

/*
 * Both eager initialization and static block initialization 
 * create the instance even before it’s being used and that is not the best practice to use
 */
public class StaticBlockIntialization {
	
	private static StaticBlockIntialization instance;
	
	private StaticBlockIntialization() {}
	
	static {
		try {
			instance=new StaticBlockIntialization();
		} catch (Exception e) {
			throw new RuntimeException("Error occured at the time of creating instance");
		}
	}

	public static StaticBlockIntialization getInstance() {
		return instance;
	}
}
