package inheritance;

public class ChildA extends ParentA{

	public static void main(String[] args) {
		ChildA obj=new ChildA();
		obj.display();
		obj.sum();
		ChildA obj1=new ChildA();

	}
	int x=100;
	public void display()
	{
		System.out.println(x);
		System.out.println(super.x);
		super.display();
	}
	public ChildA()
	{
		super();
		System.out.println("child constructor");
	}

}
