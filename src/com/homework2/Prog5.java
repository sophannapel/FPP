package com.homework2;

import java.util.Scanner;

/**
 * Purpose:
 * a) Write a program (called Prog5) that asks the user to input a String.
 * The output is the characters of this String in reverse order. (For example,
 * if the input string is "Hello", the output string would be "olleH".) (Do not
 * use arrays and do not create a new String object.) (Definitely do for the
 * midterm.)
 * 
 * b) Output the number of x in the string from the user. For example if the
 * user types in Exit abc exit, then the output would be 2 x characters
 * 
 * @author Sophanna Pel 984704
 * Date June 23, 2015
 *
 */

/* use the Scanner if you want to parse the file, use the BufferedReader
 * if you want to read the file line by line
 */
public class Prog5 {

	public static void main(String[] args) {
		Prog5 obj = new Prog5();
		char ch;
		
		String input = obj.inputString();
		obj.reverseString(input);
		
		Scanner cin = new Scanner(System.in);
		System.out.print("Input character to count : ");
		String temp = cin.nextLine();
		if(temp.isEmpty())
			ch = 'x';
		else
			ch = temp.charAt(0);
		obj.countCharacter(input, ch); // count any character in string
	}
	
	String inputString() {
		Scanner cin = new Scanner(System.in);
		System.out.println("Input your string : ");
		String input = cin.nextLine();
		return input;
	}
	
	void reverseString(String s) {
		System.out.print("Output string in reversed order : ");
		for(int i=s.length()-1; i>=0; i--) {
			System.out.print(s.charAt(i));
		}
		System.out.println();
	}
	
	void countCharacter(String s, char x) { //s is the original string and x is the character that we need to count
		int count = 0;
		for(int i=0; i<s.length(); i++)
			if(s.charAt(i) == x)
				count++;
		System.out.println(count + " '" + x + "' characters");

	}

}
