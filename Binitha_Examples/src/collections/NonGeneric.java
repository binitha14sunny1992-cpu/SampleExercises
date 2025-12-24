package collections;

import java.util.*;

public class NonGeneric {

	public static void main(String[] args) {
		List color=new ArrayList(); 
		color.add(100);
		color.add("Blue");
		color.add('c');
		System.out.println(color);
		Set number=new HashSet(); //doesnot support TreeSet
		number.add(100);
		number.add('h');
		number.add("welcome");
		number.add(200);
		number.add('d');
		number.add("bye");
		System.out.println(number);//unordered

	}

}
