package com.carfactory;

public class HondaCity extends Honda implements Diseal {
	
	
	
	public void info()
	{
		System.out.println("Car Name: Honda City"
				+ "Price : 9.81-14.16 Lakh"
				+ "Seat :5"
				+ "Mileage : 25 kmpl");
	}

	@Override
	public void fuel() {
		// TODO Auto-generated method stub
		System.out.println("Fuel Type : Diseal");
		
	}

	/*
	@Override
	public void brand() {
		// TODO Auto-generated method stub
		System.out.println("hondacity brand");
	}
	*/
	
	
	public static void main(String[] args) {
		HondaCity h=new HondaCity();
	    Car c=new HondaCity();
		Honda hd=new HondaCity();
	    
	    h.basicInfo();
		h.info();
		h.fuel();
		h.engineType();
		h.brand();
		
		//c.info();
		//c.brand();
		//hd.brand();
		
		
		
		
	}
	
	

}
