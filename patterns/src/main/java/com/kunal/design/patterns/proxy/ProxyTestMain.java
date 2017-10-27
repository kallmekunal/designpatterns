package com.kunal.design.patterns.proxy;

public class ProxyTestMain {

	public static void main(String[] args) {

		Proxy myProxy = new Proxy(12, 12);
		myProxy.displayImage();
		
		Proxy myProxy2 = new Proxy(2, 12);
		myProxy2.displayImage();
	}

}
