package collections;

import java.util.Scanner;

public class Name {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Your name: ");
		String name=sc.nextLine();
		System.out.println(name);
		System.out.println("Basic Pay: ");
		double bp=sc.nextDouble();
		System.out.println(bp);
	}

}
