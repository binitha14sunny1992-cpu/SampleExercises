package collections;

import java.util.*;

public class Generic {

	public static void main(String[] args) {
		List<String> color=new ArrayList<String>();
		color.add("Red");
		color.add("Blue");
		color.add("Violet");
		color.add("Pink");
		color.add("Pink");
		color.add("Black");
		color.add("Pink");
		System.out.println(color);
		
		
		System.out.println(color.get(1));
		color.set(1, "brown");
		System.out.println(color);
		System.out.println(color.indexOf("Violet"));
		System.out.println(color.lastIndexOf("Pink"));
		color.remove(6);
		System.out.println(color);
		System.out.println(color.contains("Black"));
		System.out.println(color.contains("White"));
		System.out.println(color.isEmpty());
		System.out.println(color.size());
		
		/*List<Integer> num =new LinkedList<Integer>();
		num.add(100);
		num.add(200);
		num.add(300);
		num.add(400);
		System.out.println(num);*/

	}

}
