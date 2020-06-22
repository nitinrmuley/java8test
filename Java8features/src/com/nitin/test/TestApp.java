package com.nitin.test;

import java.util.function.*;

public class TestApp{
	public static void main(String args[]) {
		int x[]= {12,14,46,17,19,20,24};
		 Predicate<Integer> p1= i->i%2==0;
		 Predicate<Integer> p2=i->i>20;
		
		 for(int values:x){
			 if(p1.and(p2).test(values)) {
				 System.out.println(values);
			 }
		 }
		}
		
	}

