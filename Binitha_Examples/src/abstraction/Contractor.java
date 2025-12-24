package abstraction;

public class Contractor extends Employee{

	public static void main(String[] args) {
		Contractor obj=new Contractor();
		obj.calculateSalary(1000.00);
		obj.calculateSalary(800, 9);

	}
	public void calculateSalary(double pymt,int hr)
	{
		double totsal;
		totsal=pymt*hr;
		System.out.println("Total Sal of Contractor = "+totsal);
	}

}
