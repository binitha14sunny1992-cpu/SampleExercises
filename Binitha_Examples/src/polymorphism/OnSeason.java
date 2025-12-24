package polymorphism;

public class OnSeason extends Offseason{

	public static void main(String[] args) {
		OnSeason obj=new OnSeason();
		obj.discount(3500.00);
	}
	public void discount(double mrp)
	{
		super.discount(3500.00);
		double disprice;
		double discount;
		discount=(mrp*40)/100;
		disprice=mrp-discount;
		System.out.println("Price after discount ONSEASON = "+disprice);
	}

}
