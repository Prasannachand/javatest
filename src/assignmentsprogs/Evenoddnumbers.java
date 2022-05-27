package assignmentsprogs;

public class Evenoddnumbers {

	public static void main(String[] args) {
		
		int a[]= {100,201,300,567,367,88};
		int i;
		//System.out.println("....even numbers....");
		/*for(i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				System.out.println(a[i]);
			}
			
		}*/
		System.out.println("....odd numbers....");
		for(i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
			{
				System.out.println(a[i]);
			}
		}
		System.out.println("....even numbers....");
		
		for(int value:a)
		{
			if(value%2==0)
			{
				System.out.println(value);
			}
		}

	}
}


