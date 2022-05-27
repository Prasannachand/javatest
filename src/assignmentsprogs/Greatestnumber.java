package assignmentsprogs;

import java.util.Scanner;

public class Greatestnumber {

	public static void main(String[] args) {
		System.out.println("enter three numbers to find the greatest of numbers");
		Scanner n= new Scanner(System.in);
	      int num1=n.nextInt();
           int num2=n.nextInt();
           int num3=n.nextInt();
           if(num1>num2 && num1>num3)
           {
           System.out.println("greater number: "+num1);
           }
           else if(num2>num1 && num2>num3)
        	   
           {
        	   System.out.println("greater number: "+num2);
           }
           else
           {
        	   
        	   System.out.println("greater number: "+num3);
           }
           

	}

}
