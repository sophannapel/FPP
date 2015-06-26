package com.homework2;

/**
 * 1) Create a class Prog2. Inside its main method, create float variables to
 * store each of the following numbers: 1.27, 3.881, 9.6 Output to the console the following two values: 
 * a. the sum of the floats as an integer, obtained by casting the sum to type int 
 * b. the sum of the floats as an integer, obtained by rounding the sum to the nearest integer, using the Math.round function
 * 
 * @author 984704
 *
 */

public class Prog2 {

	public static void main(String[] args) {
		float num1 = 1.27f, num2 = 3.881f, num3 = 9.6f;
		System.out.println("Number 1 : " + num1 + "\nNumber 2 : " + num2 + "\nNumber 3 : " + num3);
		int sum = (int) (num1 + num2 + num3);
		System.out.println("Sum to type int : " + sum);
		sum = Math.round(num1 + num2 + num3);
		System.out.println("Sum to nearest integer with Math.round : " + sum);
	}
}
