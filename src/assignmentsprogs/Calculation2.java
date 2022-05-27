package assignmentsprogs;
interface ABC
{
	int a=10;
	int b=20;
	void add();
}
interface XYZ
{
	int x=30;
	int y=40;
	int c=0;
	 void mul();
}





public class Calculation2 implements ABC,XYZ
{
	//public static void main(String[] args) {

	public void add()
	{
		int c=a+b;
		System.out.println("addition: "+c);
	}
	public void mul()
	{
		int z=x*y;
		System.out.println("multiplication: "+z);
	}
	
	public static void main(String[] args) {
		
	Calculation2 cal=new Calculation2 ();
	cal.add();
	cal.mul();
	

	}

}
