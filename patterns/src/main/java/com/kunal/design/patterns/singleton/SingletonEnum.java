package com.kunal.design.patterns.singleton;

public enum SingletonEnum {
	LOGGERINSTANCE;
	
	int instanceVariable;
	
	public int getInstanceVariable() {
		return instanceVariable;
	}

	public void setInstanceVariable(int instanceVariable) {
		this.instanceVariable = instanceVariable;
	}

	public void printER(String str) {
		System.out.println("Error :"+str);
	}
	
	public void printIN(String str) {
		System.out.println("Error :"+str);
	}
	
	public void printDB(String str) {
		System.out.println("Error :"+str + " instanceValue "+ instanceVariable);
	}
	
}
