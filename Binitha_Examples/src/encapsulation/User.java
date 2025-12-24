package encapsulation;

public class User {

	public static void main(String[] args) {
		Bank obj=new Bank();
		obj.set(1001);
		int a=obj.get();
		obj.validate(a);
		System.out.println();
		obj.set(1002);
		int b=obj.get();
		obj.validate(b);

	}

}
