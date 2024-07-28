package com.design.singleton;

/*
 * The preceding implementation works fine in the case of the single-threaded environment, 
 * but when it comes to multi-threaded systems, 
 * it can cause issues if multiple threads are inside the if condition at the same time. 
 * It will destroy the singleton pattern and both threads will get different instances of the singleton class.
 */
public class LazyInitilization {
	
	private static LazyInitilization instance;
	
	private LazyInitilization() {}
	
	public static LazyInitilization getInstance() {
		if (instance == null) {
			instance= new LazyInitilization();
		}
		return instance;
	}

}
