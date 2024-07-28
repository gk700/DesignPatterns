package com.design.singleton;

/*
 *  private inner static class that contains the instance of the singleton class. 
 *  When the singleton class is loaded, 
 *  SingletonHelper class is not loaded into memory and only when someone calls the getInstance() method, 
 *  this class gets loaded and creates the singleton class instance.
 */
public class BillPushSingleton {
	
	private BillPushSingleton() {}
	
	private static class SingletonHelper{
		private static final BillPushSingleton INSTANCE  = new BillPushSingleton();
	}
	
	public BillPushSingleton getInstance() {
		return SingletonHelper.INSTANCE;
	}

}
