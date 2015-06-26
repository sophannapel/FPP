package com.homework2;

/**
 * Purpose: Write a program (called Prog6) that accepts String arguments (stored
 * in args) from the main method, removes all duplicates, and outputs these
 * arguments (without duplicates) in a comma-separated format. For example, if
 * the input into the main method is ["horse", "dog", "cat", "horse","dog"] then
 * the output would be "horse","dog","cat" Typical output: Original list: [
 * horse dog cat horse dog horse cat horse ] List without duplicates: [ horse
 * dog cat
 * 
 * @author pelsophanna Date June 23, 2015
 */

public class Prog6 {

	public static void main(String[] args) {
		int i, j;

		System.out.print("Original List: [ ");
		for (i = 0; i < args.length; i++)
				System.out.print(args[i] + " ");
		System.out.println("]");

		if (args.length > 0) {
			for (i = 0; i < args.length; i++) {
				for (j = i + 1; j < args.length; j++) 
					if (args[i].equals(args[j]))
						args[j] = "";
				}
			
			System.out.print("List without duplicates: [");
			for (i = 0; i < args.length; ++i)
				if (!args[i].equals("")) 
					System.out.print(" " + args[i]);
			System.out.print(" ]");	
		}
	}
}
