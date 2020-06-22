package com.nitin.test;

import java.util.*;
interface myinterf{
	public  void add (int a, int b);
}

public class TestMethodRef {

	
	public static void sum(int x, int y) {
		System.out.println("add is "+(x+y));
	}
	
	public static void main(String[] args) {
	  
		//myinterf f= (a,b) -> System.out.println("my lambda add is "+ (a+b));
		//f.add(3, 4);
		// instead of above commneted lines we can use method reference for refering same type of method i.e sum

		myinterf f=TestMethodRef::sum;
		f.add(5, 5);
		
		
	}

}
