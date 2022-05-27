package assignmentsprogs;

public class Twodimensionalarrayadd {

	public static void main(String[] args) {
		int a[][]= {{100,20},{200,30},{400,60}};
		int i;
		int j;
	int	sum=0;
		
		/*	Scanner s=new Scanner(System.in);
			System.out.println("enter number of rows of array");
			int i=s.nextInt();
			System.out.println("enter number of coloumns of array");
			int j=s.nextInt();*/
	for(i=0;i<a.length;i++)
	{
		for(j=0;j<a[i].length;j++)
		{
			sum=sum+a[i][j];
		}
	}
	System.out.println("sum of numbers in array: "+sum);

	}

}
