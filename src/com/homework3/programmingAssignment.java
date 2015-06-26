package com.homework3;

import java.util.Scanner;

public class programmingAssignment {

	public static void main(String[] args) {
		int[] array = {2, -21, 3, 45, 0, 12, 18, 6, 3, 1, 0, -22};
		
		if(array.length > 0) {
			System.out.println("Original array is : ");
			System.out.print("[ ");
			for(int i=0; i<array.length; i++)
				System.out.print(array[i]+" ");
			System.out.print("]");
			
			System.out.println("\nThe minimum number is : " + minimum(array));
			System.out.printf("The average of array is : %.3f", average(array));
		}
		
		System.out.println("\n--------------------------------------------------------------------");
		Scanner sc = new Scanner(System.in);
		System.out.print("Input a sentence : ");
		StringBuilder input = new StringBuilder(sc.nextLine());
		caseConversion(input);
	}
	
	/**
	 * that outputs the minimum of an array of ints. Create a main method that tests your
	 * method on the following input array
	 */
	static int minimum(int[] arrayOfInts) {
		int minNum = 0;
		for(int i=0; i<arrayOfInts.length; i++) {
			if(minNum > arrayOfInts[i])
				minNum = arrayOfInts[i];
		}
		return minNum;
	}
	
	/**
	 * Do the same as above but instead of the minimum find the average of the numbers in the array.
	 */
	static double average(int[] arrayOfInts) {
		int sum = 0;
		for(int i=0; i<arrayOfInts.length; i++)
			sum += arrayOfInts[i];
		System.out.println("The sum of array is : " + sum + " with length : " + arrayOfInts.length);;
		return ((double)sum/(arrayOfInts.length));
	}
	
	/**
	 * Write a program that reads a sentence and prints out the sentence with all uppercase letters changed to lowercase and all lowercase letters changed to uppercase.
	 */
	static void caseConversion(StringBuilder input) {
		char temp;
		for(int i=0; i<input.length(); i++) {
			temp = input.charAt(i);
			if(Character.isUpperCase(temp))
				input.setCharAt(i, Character.toLowerCase(temp));
			else
				input.setCharAt(i, Character.toUpperCase(temp));
		}
		System.out.println("String after case conversion : " + input);
	}
}
