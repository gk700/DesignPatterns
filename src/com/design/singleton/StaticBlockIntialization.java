package com.design.singleton;

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
