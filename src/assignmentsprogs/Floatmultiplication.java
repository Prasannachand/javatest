package assignmentsprogs;

import java.util.Scanner;

public class Floatmultiplication {
	public static void main(String[] args)
	{
		double f1;
		double  f2;
		double product;
		Scanner a= new Scanner(System.in);
		System.out.println("Enter first number  ");
		f1=a.nextDouble();
		System.out.println("Enter second number");
	    f2=a.nextDouble();
	    product=f1*f2;
	    System.out.println("Product of two floating point numbers:"+product);
		
		
	}

}
