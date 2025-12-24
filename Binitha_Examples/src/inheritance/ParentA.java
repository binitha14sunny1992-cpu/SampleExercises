package inheritance;

public class ParentA {
	int x=200;
	public void sum()
	{
		int a=10;
		int b=20;
		int c;
		c=a+b;
		System.out.println("Sum = "+c);
	}
	public void display()
	{
		System.out.println("Method Addition");
	}
	public ParentA()
	{
		System.out.println("parent constructor");
	}

}
