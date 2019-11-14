package com.carfactory;

public interface Diseal {

	
	public void fuel();
	
	 default void engineType()
	   {
    System.out.println("Diseal Engine ");
       }
	 
}
