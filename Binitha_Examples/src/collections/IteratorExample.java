package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class IteratorExample {

	public static void main(String[] args) {
		List<Integer> number=new ArrayList<Integer>();
		number.add(100);
		number.add(200);
		number.add(300);
		number.add(400);
		number.add(500);
		number.add(600);
		number.add(700);
		for(int i=0;i<7;i++)
		{
			System.out.println(number.get(i));
		}
		
		Set<String> country=new HashSet<String>();
		country.add("Spain");
		country.add("India");
		country.add("Portugal");
		country.add("Italy");
		country.add("Netherlands");
		country.add("Bhutan");
		country.add("Nepal");
		country.add("Swizz");
		System.out.println(country);
		/*Iterator<String> i=country.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		i.remove();
		System.out.println(country);*/
		for(String n:country)
		{
			System.out.println(n);
		}
		
		

	}

}
