package accessmodifireone;

import acessmodifiers.AcessClass1;

public class Access3 extends AcessClass1{

	public static void main(String[] args) {
		AcessClass1 obj2=new AcessClass1();
		obj2.display();
		
		Access3 obj3=new Access3();
		obj3.display();
		obj3.display2();
		

	}

}
