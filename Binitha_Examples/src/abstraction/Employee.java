package abstraction;

public abstract class Employee {
	public abstract void calculateSalary(double salperhr,int hr);
	public void calculateSalary(double salehr)
	{
		double totsalary=salehr*8;
		System.out.println("Full Time Emplyee Salary = "+totsalary);
	}

}
