package assignmentsprogs;

public class Arraysum {

	public static void main(String[] args) {
		int a[]= {100,200,300,400};
		int sum=0;
		int i;
		for(i=0;i<=a.length-1;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("sum of numbers in array:"+sum);
		



	}

}
