package com.homework3;

/**
 * a) First do the algorithms on paper only, make sure that it works in your mind! At least two for loops are needed, 
 * one nested inside the other. Only after it works in your mind get it to work on the computer! Do Not use printf for this.
 * 
 * Prompt the user for a number, for the length on the bottom of a picture. For example, say they input 6. The picture would 
 * look like : (Definitely do this first one for the midterm.)
 * 
 * @author 984704
 *
 */

public class StarProgramming {

	public static void main(String[] args) {
		StarProgramming obj = new StarProgramming();
		int height = 11;
		
		System.out.println("Right triangle with height : " + height);
		obj.rightTriangle(height);
		
		System.out.println("\nLeft triangle with height : " + height);
		obj.leftTriangel(height);
		
		if((height%2) != 0) {
			System.out.println("\nEquilateral triangle with height : " + height);
			obj.equilateralTriangle(height);
			System.out.println("\nRight equilateral triangle with height : " + height);
			obj.rightEquilateralTriangle(height);
			System.out.println("\nLeft equilateral triangle with height : " + height);
			obj.leftEquilateralTriangle(height);
			System.out.println("\nDiamond shape with height : " + height);
			obj.diamondShape(height);
		}
	}

	void rightTriangle(int height) {
		int i;
		for (i = 1; i < height; i++) { // control the row of star
			System.out.print("*");

			for (int j = 1; j < i - 1; j++)
				// print space
				System.out.print(" ");

			if (i > 1) // only one star for first row
				System.out.print("*");
			System.out.println(); // indent for the next star line
		}

		for (i = 1; i <= height; i++)
			System.out.print("*");
	}

	void leftTriangel(int height) {
		int i, k;
		for (i = 1; i < height; i++) {
			for (k = 1; k <= height - i; k++)
				// print space before triangle
				System.out.print(" ");
			System.out.print("*"); // print first star near to the space

			for (k = 1; k < i - 1; k++)
				// print space inside triangle
				System.out.print(" ");

			if (i > 1) // only one star for first row
				System.out.print("*");
			System.out.println(); // go to the second star line
		}
		for (i = 1; i <= height; i++)
			// print star for the last line
			System.out.print("*");
	}

	void equilateralTriangle(int height) {
		int i, k, mid = (height / 2) + 1, inSpace=-1;
		for (i = 1; i < mid; i++) {
			for (k = mid; k > i; k--)
				System.out.print(" "); // print space before left triangle
			System.out.print("*"); // print star near to left space of left side triangle
			
			if(i>1) { // first row print only one star
				inSpace += 2; // space inside triangle starts from second line as 1, 3, 5, 7,.....
				for(k=1; k<=inSpace; k++)
					System.out.print(" ");
				System.out.print("*");
			}
			System.out.println();
		}
		for (i = 1; i <= height; i++)
			System.out.print("*"); // print star for the last line
	}
	
	void rightEquilateralTriangle(int height) {
		int i, j, mid=(height/2)+1, inSpace=-1;
		for(i=1; i<=height; i++) {
			System.out.print("*");
			if(i<=mid)
				inSpace += 1;
			else
				inSpace -= 1;
			for(j=1; j<=inSpace; j++)
				System.out.print(" ");
			if(i>1 && i<height)
				System.out.print("*");
			System.out.println();
		}
	}
	
	void leftEquilateralTriangle(int height) {
		int i, j, mid=(height/2)+1, space=0, inSpace=-1;
		for(i=1; i<=height; i++) {
			
			if(i<=mid) {
				if(i==1) //for first star line print 1 star, print space equals to mid
					space = mid;
				else
					space = mid-i;
				inSpace += 1;
			}
			else {
				if(i==height) //for last star line print 1 star, print space equals to mid
					space = mid;
				else
					space += 1;
				inSpace -= 1;
			}
			
			for(j=1; j<=space; j++) // print left side space
				System.out.print(" ");
			System.out.print("*"); // print star near to left side space
			
			if(i>1 && i<height) {
				for(j=1; j<=inSpace; j++)
					System.out.print(" ");
				System.out.print("*"); // print star near to left side space
			}
			System.out.println();
		}
	}
	
	void diamondShape(int height) {
		int i, k, mid=(height/2)+1, inSpace=-1;
		//upper diamond
		for (i = 1; i <=mid; i++) {
			for (k = mid; k > i; k--)
				System.out.print(" "); // print space before upper left triangle
			System.out.print("*"); // print star near to upper left space of left side triangle
			
			if(i>1) { // first row print only one star
				inSpace += 2; // space inside upper triangle starts from second line as 1, 3, 5, 7,.....
				for(k=1; k<=inSpace; k++)
					System.out.print(" ");
				System.out.print("*");
			}
			System.out.println();
		}
		
		//lower diamond
		for(i=1; i<=mid-1; i++) {
			for(k=1; k<=i; k++) //print space for lower left side
				System.out.print(" ");
			System.out.print("*");
			
			if(i<mid-1) {
				inSpace -= 2; 
				for(k=1; k<=inSpace; k++) //print space for lower left side
					System.out.print(" ");
				System.out.print("*");
			}			
			System.out.println();
		}
		
	}
}
	
