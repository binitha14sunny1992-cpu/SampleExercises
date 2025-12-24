package encapsulation;

public class Bank {
	private int pin;
	public void set(int pin)
	{
		this.pin=pin;
	}
	public int get()
	{
		System.out.println("Given pin = "+pin);
		return pin;
	}
	public void validate(int pin)
	{
		
			if(pin==1001)
			{
				System.out.println(pin+ " is a valid pin");
			}
			else if(pin==1234)
			{
				System.out.println(pin+ " is a valid pin");
			}
			else if(pin==1212)
			{
				System.out.println(pin+ " is a valid pin");
			}
			else
			{
				System.out.println(pin+ " is a invalid pin");
			}
		}
	

}
