package com.homework3;

import javax.swing.JOptionPane;

/**
 * 2) Prompt the user for a string. Save it in a StringBuffer object. 
 * a)Append bye to the above. Print it out.  
 * b)Make all lowercase letters uppercase, and uppercase letters lowercase. Print the new string. 
 * (For lowercase you can use something like if ((char1 >= a) && (char1 <= z))...Also check out the Character class!)
 * 
 * @author 984704
 *
 */

public class myStringBuffer {

	public static void main(String[] args) {	
		char temp;
		StringBuffer obj = new StringBuffer(JOptionPane.showInputDialog("Input a sentence"));
		System.out.println("Original sentense : " + obj);
		System.out.println("Append 'bye' : " + obj.append("bye"));
		
		
		for(int i=0; i<obj.length(); i++) {
			temp = obj.charAt(i);
			if(Character.isUpperCase(temp))
				obj.setCharAt(i, Character.toLowerCase(temp));
			else
				obj.setCharAt(i, Character.toUpperCase(temp));
		}		
		System.out.println("Case conversion : " + obj);
	}
}
