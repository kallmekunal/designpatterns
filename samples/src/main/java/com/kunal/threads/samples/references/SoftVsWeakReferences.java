package com.kunal.threads.samples.references;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.lang.ref.*;

public class SoftVsWeakReferences {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Reference<MyObject>> arrayList = new ArrayList<Reference<MyObject>>();
		for(int i = 0; i < 10; i++) {
			MyObject myobject1 = new MyObject("Soft " +i);
			MyObject myobject2 = new MyObject("Weak " +i);
			Reference<MyObject> ref = new SoftReference<MyObject>(myobject1);
			Reference<MyObject> ref2 = new WeakReference<MyObject>(myobject2);
			arrayList.add(ref);
			arrayList.add(ref2);
			
			new MyObject("Normal "+ i);
		}
		
		 printReferences(arrayList);
	}

	private static void printReferences(List<Reference<MyObject>> arrayList) {
		// TODO Auto-generated method stub
		ExecutorService service = Executors.newSingleThreadExecutor();
		service.execute(new Runnable() {
			
			public void run() {
				  try {
		              //sleep a little in case if finalizers are currently running
		              Thread.sleep(1000);
		          } catch (InterruptedException e) {
		              e.printStackTrace();
		          }
		          System.out.println("-- printing references --");
		          arrayList.stream()
		                    .forEach(SoftVsWeakReferences::printReference);

				
			}
		});
		service.shutdown();
	}
	
	public static void printReference(Reference<MyObject> r) {
	      System.out.printf("Reference: %s [%s]%n", r.get(),
	              r.getClass().getSimpleName());
	  }

}
