package assignmentsprogs;

import java.util.Scanner;

public class Palindromenumber {
	public static void main(String[] args)
	{
		System.out.println("enter a number");
		Scanner sc = new Scanner(System.in);
	      int a=sc.nextInt();
	      int num;
	      num=a;
	      int value=0;
	      
	         while(num>0)
	      {
	    	  value=value*10+num%10;
	    	  num=num/10;
	      }
	         System.out.println("After Reverse number is:  "+value);
	      
	      if(a==value)
	           System.out.println(+a+  " is a  palindrome number");
	      else
	    	   System.out.println(+a+  " number is not palindrome");
	}

}
