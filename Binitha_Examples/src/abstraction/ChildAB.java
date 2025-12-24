package abstraction;

public class ChildAB implements ParentA, ParentB{

	public static void main(String[] args) {
		ChildAB obj=new ChildAB();
		obj.display();
		obj.print();
		obj.printing();

	}
	public void display() {
		System.out.println("parent A -Display");
	}
	public void print()
	{
		System.out.println("parent A print");
	}
	public void printing()
	{
		System.out.println("parentB");
	}
}
