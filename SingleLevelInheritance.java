package com.vstl.javaInheritance;

public class SingleLevelInheritance {

	public void hotel() {
		
		System.out.println("Welcome to the Restaurant");
	}
	
}

//single Level inheritance we can derive a single class method from the parent class
//Always static methods cannot be inherited.

 class HotelMenu extends SingleLevelInheritance {

	 void menulisst() {
		 
		 System.out.println("Get the Menu List");
	 }
	 
}