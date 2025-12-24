package exceptionhandling;

public class Keywords {

	public static void main(String[] args) {
		Keywords obj=new Keywords();
		try
		{
		obj.eligibility(14);
		}
		catch( ArithmeticException e) 
		{
			System.out.println("enter valid age");
		}

	}
	public void eligibility(int age)throws ArithmeticException
	{
		if(age<=18)
		{
			throw new ArithmeticException("Access Denied");
		}
		else
		{
			System.out.println(" Eligible for Driving License");
		}
	}

}
