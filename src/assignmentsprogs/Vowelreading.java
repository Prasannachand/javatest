package assignmentsprogs;
import java.util.Scanner;
public class Vowelreading {

	public static void main(String[] args) {
		Scanner rd = new Scanner(System.in);
		System.out.println("Enter the character");

		char name = rd.next().charAt(0);
		if(name=='a'||name=='e'||name=='i'||name=='o'||name=='u')
		{
			System.out.println(" character is vowel");
			
		}
		else
		{
		System.out.println("character is not a vowel");
		}
		
	}

}
