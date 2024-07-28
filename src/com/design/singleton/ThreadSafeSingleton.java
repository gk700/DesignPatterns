package com.design.singleton;

/*
 * provides thread-safety, but it reduces the performance because of the cost associated with the synchronized method, 
 * although we need it only for the first few threads that might create separate instances.
 */
public class ThreadSafeSingleton {
	
	private static ThreadSafeSingleton instance;
	
	private ThreadSafeSingleton() {}
	
	public static synchronized ThreadSafeSingleton getInstance() {
		if(instance == null) {
			instance= new ThreadSafeSingleton();
		}
		return instance;
	}

}
