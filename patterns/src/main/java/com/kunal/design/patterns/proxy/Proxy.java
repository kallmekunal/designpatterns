package com.kunal.design.patterns.proxy;

public class Proxy implements ImageViewer {

	private int length;
	private int width;

	public Proxy(int width,int length) {
		this.width = width;
		this.length = length;
	}
	
	public void displayImage() {
		if(length > 10 && width > 10) 
		{
			new RealSubject().displayImage();
		}else {
			System.out.println("Not a valid condition for displayImage for Width :"+ width +"Length :"+ length + "Dimension");
		}
		
	}

}
