package assignmentsprogs;

public class Minandmaxinarray {

	public static void main(String[] args) {
		int a[]= {10,20,3,40,5,7,8,48,56};
		int i;
		int min;
		int max;
		
		max=a[0];
		min=a[0];
		for(i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
				
			
			}
			else if(a[i]<min)
			{
				min=a[i];
			}
			
		}
System.out.println("maximum number in array is: "+max);
System.out.println("minimum number in array is: "+min);

	}

}
