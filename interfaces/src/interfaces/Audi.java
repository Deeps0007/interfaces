package interfaces;

public class Audi extends Car implements Luxury {

	@Override
	public void carType() {
		// TODO Auto-generated method stub
		System.out.println("Luxury Car");
	}

	public static void main(String[] args) {
		
		Audi a=new Audi();
		a.carType();
		 a.basicInfo();
		
	}
	
}
