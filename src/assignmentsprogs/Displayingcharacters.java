package assignmentsprogs;

import java.util.Scanner;

public class Displayingcharacters {

	public static void main(String[] args) {
		String s1=" ";
		int i;
		Scanner input = new Scanner(System.in);
		System.out.println("enter a string");
		 s1=input.nextLine();
		 System.out.println("characters in the given string");
		 for(i=0;i<s1.length();i++)
		 {
			 System.out.println(s1.charAt(i));
		 }
		

	}

}
