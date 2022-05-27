package assignmentsprogs;

import java.util.Scanner;

public class Lengthofnumber {

	public static void main(String[] args) {
		System.out.println("enter a number to calculate the length");
		Scanner n= new Scanner(System.in);
	      int number=n.nextInt();
	      int s=number;
	      int count=0;
	      int result=0;
	      
	     while(number>0)
	    	  
	    	  
	      {
	    	  result=result*10+number%10;
	    	count++;
	    	number=number/10;
	    	//count++;
	    	  
	      }
	      System.out.println("length of the number "+count);
	      System.out.println("after reversing number is "+result);
	}
	
	      //System.out.println("after reversing number is "+result);
		

	}


