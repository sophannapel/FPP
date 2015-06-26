package com.homework2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class exercisesByHand {
	private Scanner cin; //input
	
	exercisesByHand() {
		this.cin = new Scanner(System.in);
	}
	
	public static void main(String[] args) throws IOException {
		exercisesByHand obj = new exercisesByHand();
		obj.stringFunction();
		System.out.println("------------------------------------------------------------------");
		
		obj.ageFunction();
		System.out.println("------------------------------------------------------------------");
		
		obj.expressionFunction();
		System.out.println("------------------------------------------------------------------");
		
		/*
		 *  4) You are reviewing some old Java programs in your company's IT department and you                
		 *  read the following assignment statement in some abandoned code: int a = (b = 5);                
		 *  Is the statement legal (i.e. would it compile)? If so, what value is assigned to the                
		 *  variable a? Explain
		 */
		int b;
		int a=(b=5);
		System.out.println("a value is : " + a);
		/* The above expression is correct. But we must declare variable b before using it.
		 * First assign 5 to b (bracket has higher priority), then assign b value to a.
		 */		
	}

	/**
	* 1) Consider the following if then logic: if(age > 65)
	* socialSecurityStatus = "eligible"; else socialSecurityStatus ="ineligible";
	* Rewrite this (pseudo) code using the Java ternary operator.
	 */
	void ageFunction() throws IOException {
		String socialSecurityStatus;
		int age=0;
		System.out.println("Input the age : ");
		age = cin.nextInt();
		socialSecurityStatus = (age > 65) ? "eligible" : "ineligible";
		System.out.println("Your social security status : " + socialSecurityStatus);
	}

	/**
	 * 2) Suppose a String s is initialized by String s = "a friendly face";
	 * a. Compute the value of the expression s.charAt(2); 
	 * b. What is the value of s.length()? 
	 * c. What is the value of s.substring(2,9)? s.substring(4)?
	 */
	void stringFunction() {
		String s = "a friendly face";
		System.out.println("Original string : " + s);
		System.out.println("s.charAt(2) : " + s.charAt(2));
		System.out.println("s.lenght() : " + s.length());
		System.out.println("s.substring(2,9) : " + s.substring(2, 9));
		System.out.println("s.substring(4) : " + s.substring(4));
	}
	
	/**
	 * 3) Write a Java expression that computes each of the following: 
	 * a. Given the radius r of a circle, compute the area of the circle, and store it in a variable A. 
	 * b. Given the length len and width wid of a rectangle, compute the length of the diagonal of the rectangle, 
	 * and store it in a variable diag.
	 */
	void expressionFunction() {	
		double radius=0, A, len=0, wid=0, diag;
		String temp = null;
		System.out.println("Input the radius of a circle : ");
		
		/*while(cin.hasNextLine()) // to check if there is next line with hasNextLine
			temp = cin.nextLine();
		radius = Double.parseDouble(temp);*/
		radius = cin.nextDouble();
		
		A = Math.pow(radius, 2) * Math.PI;
		System.out.println("The area of the circle is " + A);
		
		System.out.println("Input the length and width of a rectangle : ");
		/*while(!cin.hasNextLine())
			len = Double.parseDouble(cin.nextLine());
		while(!cin.hasNextLine())
			wid = Double.parseDouble(cin.nextLine());*/
		
		len = cin.nextDouble();
		wid = cin.nextDouble();
		diag = Math.sqrt(Math.pow(wid, 2)+Math.pow(len, 2));
		System.out.println("The diagonal of a rectangle is : " + diag);		
		cin.close();
	}
}
