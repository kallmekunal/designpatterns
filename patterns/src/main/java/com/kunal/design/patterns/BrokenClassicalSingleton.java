package com.kunal.design.patterns;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.kunal.design.patterns.singleton.SingleTonClassic;
import com.kunal.design.patterns.singleton.SingletonEnum;

public class BrokenClassicalSingleton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 SingleTonClassic classicSingleTon = SingleTonClassic.getInstance();
	        System.out.println(classicSingleTon.getInstanceCount());
	        
	        Class classicalSingleton = classicSingleTon.getClass();
	        Constructor methodConstructor = null;
			try {
				methodConstructor = classicalSingleton.getDeclaredConstructor(new Class[0]);
			} catch (NoSuchMethodException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (SecurityException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	        methodConstructor.setAccessible(true);
	        try {
				SingleTonClassic classic2 =  (SingleTonClassic) methodConstructor.newInstance(null);
				
				if(classic2 == classicSingleTon) {
					System.out.println("Same instance");
				}else {
					System.out.println("Diffrent instance");
				}
				System.out.println(classic2.getInstanceCount());
			} catch (InstantiationException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalAccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        
	}

}
