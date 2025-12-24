package collections;

import java.util.*;

public class SetExample {

	public static void main(String[] args) {
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
		
		Set<String> fruit=new HashSet<String>();
		fruit.add("apple");
		fruit.add("orange");
		fruit.add("plum");
		System.out.println(fruit);
		
		country.addAll(fruit);
		System.out.println(country);
		System.out.println(fruit);
		
		country.remove("Spain");
		System.out.println(country);
		
		country.removeAll(fruit);
		System.out.println(country);
		
		System.out.println(country.contains("India"));
		System.out.println(country.contains(fruit));
		
		System.out.println(country.isEmpty());
		System.out.println(country.size());
		fruit.clear();
		System.out.println(fruit);
		
	}

}
