package com.kunal.design.patterns.proxy;

public class RealSubject implements ImageViewer {

	public void displayImage() {
		System.out.println("This is real subject");
	}

}
