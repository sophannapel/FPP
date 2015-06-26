package com.homework3;

import java.util.Scanner;

/**
 * 1) Write an application that determines if an input word is a palindrome. 
 * A palindrome is a string that reads the same forward and backward, for example,
 * noon and madam. Ignore the case of the letter. (Definitely do for the
 * midterm.)
 * 
 * @author 984704
 *
 */

public class palindrome {

	public static void main(String[] args) {
		palindrome obj = new palindrome();
		boolean flag;
		Scanner sc = new Scanner(System.in); 
		
		//word palindrom
		System.out.println("Input a word : ");
		String word = sc.nextLine(); 
		flag = obj.wordPalindrome(word);
			
		if(flag == true)
			System.out.println(word + " is a palindrome");
		else
			System.out.println(word + " is not a palindrome");
		
		//sentence palindrome
		System.out.println("Input a sentence : ");
		String sentence = sc.nextLine();
		flag = obj.sentencePalindrome(sentence);
		
		if(flag == true)
			System.out.println(sentence + " is a palindrome");
		else
			System.out.println(sentence + " is not a palindrome");
		
	}
	
	boolean wordPalindrome(String word) {
		int len = word.length();
		word = word.toLowerCase();
		
		for(int i=0; i<(len/2); i++) 
			if(word.charAt(i) != word.charAt(len-1-i)) 
				return false;
		return true;
	}
	
	boolean sentencePalindrome(String sentence) {
		sentence = sentence.replaceAll("\\W", "").toLowerCase(); //remove space and punctuation then convert all to lower case
		System.out.println(sentence);
		return wordPalindrome(sentence);
	}
}
