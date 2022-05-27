package assignmentsprogs;
interface A
{
	int a=10;
	int b=20;
	//int c=0;
	 void sum();	
	
}

public class B implements A{
	public void sum()
	{
		int c=a+b;
		System.out.println("addition of a and b " +c);
	}

	public static void main(String[] args) {
		
		B bobj=new B();
		bobj.sum();
		//A aobj=new B();
        // aobj.sum();
	}

}
