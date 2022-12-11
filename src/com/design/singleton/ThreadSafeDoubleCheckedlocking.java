package com.design.singleton;
/*
 * To avoid this extra overhead every time, double-checked locking principle is used. In this approach, 
 * the synchronized block is used inside the if condition with an additional check 
 * to ensure that only one instance of a singleton class is created.
 */
public class ThreadSafeDoubleCheckedlocking {
	
	private static ThreadSafeDoubleCheckedlocking instance;
	
	private ThreadSafeDoubleCheckedlocking() {}
	
	public static ThreadSafeDoubleCheckedlocking getInstance() {
		if (instance == null) {
			synchronized (ThreadSafeDoubleCheckedlocking.class) {
				if(instance == null) {
					instance=new ThreadSafeDoubleCheckedlocking();
				}
			}
		}
		return instance;
	}

}
