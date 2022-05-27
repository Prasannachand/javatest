package assignmentsprogs;

import java.util.Scanner;

public class Mathoperations {

	public static void main(String[] args) {
	
	
	int c;
		System.out.println("enter the value of a");
		Scanner num1= new Scanner(System.in);
	      int a=num1.nextInt();
		  System.out.println("enter the value of b");
		  Scanner num2= new Scanner(System.in);
		  int b=num2.nextInt();
		  System.out.println("Enter a number\n 1.Addition\n2.Subtrsction\n3.Multiplication\n4.Division\n");
		  Scanner num3= new Scanner(System.in);
		    int x=num3.nextInt();
		    switch(x)
		    {
		    case 1:c=a+b;
		    System.out.println("addition of numbers=" +c);
		    break;
		    case 2:c=a-b;
		    System.out.println("subtraction of numbers=" +c);
		    break;
		    case 3:c=a*b;
		    System.out.println("multiplication of numbers=" +c);
		    break;
		    case 4:c=a/b;
		    System.out.println("division of numbers=" +c);
		    break;
		    default :System.out.println("enter the correct value");
		    break;
		    }
		    
	}

}
