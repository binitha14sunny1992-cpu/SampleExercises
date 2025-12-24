package exceptionhandling;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number for which factorial needed : ");
		int n=sc.nextInt();
		Factorial obj=new Factorial();
		obj.factorial(n);

	}
	public void factorial(int n)
	{
		int fact=1;
		
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of " +n+ "= "+fact);
	}

}
