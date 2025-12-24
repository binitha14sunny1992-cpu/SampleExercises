package exceptionhandling;

public class ExceptionExample {

	public static void main(String[] args) {
		try
		{
			int a=100;
			int b=0;
			int c=a/b;
			System.out.println("Division Result = "+c);	
		}
		catch(ArithmeticException e)
		{
			System.out.println("Error Message");
		}
		finally 
		{
			System.out.println("Welcome");
		}
		

	}

}
