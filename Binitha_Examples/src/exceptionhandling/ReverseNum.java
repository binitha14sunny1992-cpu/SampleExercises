package exceptionhandling;

import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number to be reversed : ");
		
		int num=sc.nextInt();
		
		ReverseNum obj=new ReverseNum();
		obj.reversenum(num);
				

	}
	public void reversenum(int num)
	{
		int reversenum=0;
		int temp=num;
		while(temp!=0)
		{
			int reminder=temp%10;
			reversenum=reversenum*10+reminder;
			temp=temp/10;
		}
		System.out.println("Reverse of "+num+" = " +reversenum);
		
	}

}
