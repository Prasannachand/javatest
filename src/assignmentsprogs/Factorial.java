package assignmentsprogs;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args)
	{
		
		long  fact=1;
		int i=1;
		System.out.println("enter a number to calculate factorial");
		Scanner n= new Scanner(System.in);
	      int a=n.nextInt();
		for(i=1;i<=a;i++)
			
		{
			fact=fact*i;
			
		}
		System.out.println( "Factorial is :"+fact);
			

	}
	

}
 