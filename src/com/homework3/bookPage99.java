package com.homework3;

/**
 * On page 99, there is table 3-8.  We will only use the top three rows. Create a two dimensional table with  3  rows 
 * and  6  columns. Put the data from the top 3 rows of table 3-8 into your table.
 * a)	Print out the average of each row.
 * b)	Print out the average of each column.
 */

public class bookPage99 {
	public static void main(String[] args) {
		float[][] array = {{10000.00f, 10000.00f, 10000.00f, 10000.00f, 10000.00f, 10000.00f},
						   {11000.00f, 11100.00f, 11200.00f, 11300.00f, 11400.00f, 11500.00f},
						   {12100.00f, 12321.00f, 12544.00f, 12769.00f, 12996.00f, 13225.00f}};
		System.out.println("Array data:");
		for(int i=0; i<array.length; i++) {
			System.out.print("[ ");
			for(int j=0; j<array[i].length; j++) 
				System.out.print(array[i][j] + " ");
			System.out.println("]");
		}
		System.out.println("---------------------------------------------------------------------");
		rowAverage(array);
		System.out.println("---------------------------------------------------------------------");
		columnAverage(array);
	
	}
	
	static void rowAverage(float[][] arr) {
		float sum;
		for(int i=0; i<arr.length; i++) {
			sum = 0;
			for(int j=0; j<arr[i].length; j++)
				sum += arr[i][j];
			System.out.printf("Average for %d row is : (%.4f/%d) = %.4f \n", i, sum, arr[i].length, (sum/arr[i].length));
		}
	}
	
	static void columnAverage(float[][] arr) {
		float sum;
		for(int i=0; i<arr[0].length; i++) { //column
			sum = 0;
			for(int j=0; j<arr.length; j++) // row with arr.length will return row number
				sum += arr[j][i];
			System.out.printf("Average for %d column is : (%.4f/%d) = %.4f \n", i, sum, arr.length, (sum/arr.length));
		}
	}
}
