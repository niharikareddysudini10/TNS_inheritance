package com.tnsif.MulthithreadingDemo;


public class ExtendingThread extends Thread {
	
public void run() {
	System.out.println("welcome");
}

	public static void main(String args[]) {
		
	}

	ExtendingThread e=new ExtendingThread();
	
	e.start();
	
}
