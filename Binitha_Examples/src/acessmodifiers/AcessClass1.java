package acessmodifiers;

public class AcessClass1 {

	public static void main(String[] args) {
		AcessClass1 obj=new AcessClass1();
		obj.display();
		obj.display1();
		obj.display2();
		obj.display3();

	}
	public void display()
	{
		System.out.println("PUBLIC");
	}
	private void display1()
	{
		System.out.println(" PRIVATE");
	}
	protected void display2()
	{
		System.out.println("PROTECTED");
	}
	void display3()
	{
		System.out.println("DEFAULT");
	}

}
