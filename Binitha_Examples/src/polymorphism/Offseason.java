package polymorphism;

public class Offseason {
	public void discount(double mrp)
	{
		double disprice;
		double discount;
		discount=(mrp*15)/100;
		disprice=mrp-discount;
		System.out.println("Price after discount OFFSEASON = "+disprice);
	}

}
