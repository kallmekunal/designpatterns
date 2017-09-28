package com.kunal.threads.samples.references;

public class MyObject {
 private int [] intarr = new int [1000];
 private String myname;
 
 public MyObject(String myname) {
	 this.myname = myname;
 }

 @Override
 public String toString() {
     return myname;
 }

 @Override
 protected void finalize() throws Throwable {
     System.out.printf("Finalizing: %s%n", myname);
 }
}
