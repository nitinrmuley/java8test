package com.nitin.test;

import java.util.function.Consumer;

class Movie{
	
	String name;
	
	public Movie(String name) {
		this.name=name;
		
	}
}



public class ConsumerTest {

	public static void main(String[] args) {
       Consumer<Movie> c1= m1->System.out.println("Movie name is "+m1.name);
       Consumer<Movie> c2=m2->System.out.println("This Movie flopped "+m2.name);
	   Consumer<Movie> cc=c1.andThen(c2);
       Movie m = new Movie("DDLJ");
       cc.accept(m); //all consumers accepted
	
	}

}
