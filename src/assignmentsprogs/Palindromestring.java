package assignmentsprogs;

import java.util.Scanner;

public class Palindromestring {

	public static void main(String[] args) {
		String s1=" ";
		int i;
		String original;
		String rev=" ";
		Scanner input = new Scanner(System.in);
		System.out.println("enter a string");
	     s1=input.next();
	     original=s1;
	     for(i=s1.length()-1;i>=0;i--)
	     {
	    	 rev=rev+s1.charAt(i);
	    	 
	     }
	
if(original==rev)
{
	System.out.println("string is palindrome");
	
}
else
{
	System.out.println("string is not palindrome");
}

	
}
	}


