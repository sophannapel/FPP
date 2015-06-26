package com.homework6;

public class Exponential {

	public static void main(String[] args) {
		Exponential ex = new Exponential();
		int base, exponent;
		base = 19;
		exponent = 3;
		double result = ex.power(base, exponent);
		System.out.println("pow("+ base+"," +exponent+") : " + result);
		//System.out.println(Math.pow(base, exponent));
	}
	
	double power(double x,int n) {
		//base case
		if(n == 0)
			return 1;
		else 
			if(n == 1)
				return x;
			else
				return x*power(x,n-1);
	}

}
