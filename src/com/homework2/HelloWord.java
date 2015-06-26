package com.homework2;

import java.util.Scanner;

public class HelloWord {
	public static void main(String[] args) {
		System.out.println("Hello word");
		System.out.println(4.2/0);
		System.out.println(args[0]);
		
		String s1 = "", s2 = " ";
		System.out.println("-" + s1 +"-");
		System.out.println("-" + s2 +"-");
		System.out.println(s1.equals(s2));
		
		Scanner cin = new Scanner(System.in);
		System.out.println("Input you name");
		//s1 = cin.nextLine();
		System.out.println("The name that you input : " + cin.nextLine());
		
	}
}
