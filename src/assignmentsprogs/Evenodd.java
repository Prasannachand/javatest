package assignmentsprogs;

import java.util.Scanner;

public class Evenodd {
	public static void main(String[] args)
	{
		int result;
		
		System.out.println("Enter a number");
		
		Scanner input= new Scanner(System.in);
	      int a=input.nextInt();
	      result=a%2;
	      if(result==0)
	           System.out.println(a+  "  number is even number");
	      else 
	           System.out.println(a+  "  number is odd number");
	      
	
	}
	

}
