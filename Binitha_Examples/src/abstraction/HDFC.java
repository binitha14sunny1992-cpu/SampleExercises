package abstraction;

public class HDFC implements RBI{

	public static void main(String[] args) {
		HDFC obj=new HDFC();
		obj.recurringDeposit(10000.00, 3);
		
	}
	public void recurringDeposit(double amt, int duration)
	{
		double depositamt;
		depositamt =(amt*duration*RBI.rate)/100;
		System.out.println("Interst Amount = "+depositamt);
		System.out.println("Total Amount = "+(amt+depositamt));
	}

}
