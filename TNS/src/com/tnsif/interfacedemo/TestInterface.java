package com.tnsif.interfacedemo;

public class TestInterface {
	
public static void main(String args[]) {
	Bank b=new SBI();
	System.out.println("ROI"+b.rateofInterest());
	
	Bank p=new PNB();
	System.out.println("ROI"+p.rateofInterest());
}
}
