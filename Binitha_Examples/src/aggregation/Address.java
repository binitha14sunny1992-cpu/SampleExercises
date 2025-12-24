package aggregation;

public class Address {

	public static void main(String[] args) {
		Student obj=new Student("Binitha", 101);
		Address obj1=new Address("HOUSE 456","LINK ROAD","BANGALORE",258963);
		obj1.disply(obj);
	}
	String addr1;
	String addr2;
	String addr3;
	int pin;
	public Address(String addr1,String addr2,String addr3,int pin)
	{
		this.addr1=addr1;		
		this.addr2=addr2;
		this.addr3=addr3;		
		this.pin=pin;
		
	}
	public void disply(Student obj)
	{
		obj.disply();
		System.out.println("Address: "+addr1+", "+addr2+", "+addr3+", "+pin+".");	
	}

}
