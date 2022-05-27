package assignmentsprogs;

//import java.util.Scanner;

public class Singledimensionalarray {

	public static void main(String[] args) {
		int a[]= {100,200,300,400,500};
		int i;
		
		int sum=0;
		
		
	/*	Scanner s=new Scanner(System.in);
		System.out.println("enter number of rows of array");
		int i=s.nextInt();
		System.out.println("enter number of coloumns of array");
		int j=s.nextInt();*/
for(i=0;i<=a.length-1;i++)
{
	
	
		sum=sum+a[i];
}		
		
	

     System.out.println("sum of elements in array is:"+sum);
	

		
		
		

	}

}
