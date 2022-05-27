package assignmentsprogs;

import java.util.Scanner;

public class Stars {
	public static void main(String[] args)
	{
		int  i,j;
		System.out.println("Enter the number of lines starts to be printed");
		Scanner n= new Scanner(System.in);
	      int l=n.nextInt();
	      
		
		
		for(i=1;i<=l;i++)
		{
			for(j=1;j<=i;j++)
			{
				System.out.print("*");
			//	System.out.println();
				
			}
			
                 System.out.println();
		}
	
			



		
	}
	
		
	}

