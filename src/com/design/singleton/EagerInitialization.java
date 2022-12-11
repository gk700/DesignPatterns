package com.design.singleton;
/*
 * created for resources such as File System, Database connections, etc. 
 * We should avoid the instantiation unless the client calls the getInstance method. 
 * Also, this method doesn’t provide any options for exception handling.
 */
public class EagerInitialization {
	
	private static final EagerInitialization instance =new EagerInitialization();
	
	// private constructor to avoid client applications using the constructor
	private EagerInitialization() {}
	
	public static EagerInitialization getInstance() {
		return instance;
	}
	

}
