package aggregation;

public class Student {
	String name;
	int rollno;
	public Student(String name, int rollno)
	{
		this.name=name;
		this.rollno=rollno;
	}
	public void disply()
	{
		System.out.println("Name=  "+name);
		System.out.println("Roll No = "+rollno);
	}

}
