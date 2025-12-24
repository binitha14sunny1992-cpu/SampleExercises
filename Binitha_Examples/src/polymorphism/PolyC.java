package polymorphism;

public class PolyC extends PolyP{

	public static void main(String[] args) {
		PolyC obj=new PolyC();
		obj.print();
		obj.print(100);

	}
	public void print()
	{
		super.print();
		System.out.println("Welcome");
	}

}
