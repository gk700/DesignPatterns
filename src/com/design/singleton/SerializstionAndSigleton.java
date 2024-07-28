package com.design.singleton;

import java.io.Serializable;
/*
 * Sometimes in distributed systems, we need to implement Serializable interface in the singleton class 
 * so that we can store its state in the file system and retrieve it at a later point in time
 * 
 * with serialized singleton class is that whenever we deserialize it, it will create a new instance of the class
 * To overcome this scenario, all we need to do is provide the implementation of readResolve() method.
 */
public class SerializstionAndSigleton implements Serializable{
	
	private static final long serialVersionUID = -7604766932017737115L;
	
	private SerializstionAndSigleton() {}
	
	private static class SingletonHelpper{
		private static final SerializstionAndSigleton INSTANCE =new SerializstionAndSigleton();
	}
	
	public static SerializstionAndSigleton getInstance() {
		return SingletonHelpper.INSTANCE;
	}
	
	protected Object readResolve() {
		return getInstance();
	}

}
