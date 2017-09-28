package com.kunal.design.patterns.singleton;

/**
 * @author ekukuna
 * Below is the example of lazy initializaiton of singleton instance of class.
 * We have used double checked locking pattern ,with volatile instance variable.
 * Another possible approact could be to go for eager initialization and initializaiton 
 * at the time of declaration only but for large objects that are unused or used at later point of time
 * that is in itsef a overhead. 
 *
 */
public class SingleTonClassic {

	private static volatile SingleTonClassic INSTANCE = null;
	private static int instanceCount =0;
	
	//The private constructor.
	private SingleTonClassic() {
		instanceCount++;
	}
	
	//Factory method to get instance,
	//double checked locking example.
	public static SingleTonClassic getInstance() {

		if(INSTANCE == null) {
			System.out.println("Called getInstance....Called");
			synchronized (SingleTonClassic.class) {


				if(INSTANCE == null)
				{
					INSTANCE = new SingleTonClassic();
				}
			}
		}
		return INSTANCE;
	}

	public int getInstanceCount() {
		return instanceCount;
	}
	
}
