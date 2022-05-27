package assignmentsprogs;

public class CompareStrings {

	public static void main(String[] args) {
		String s1="hello";
		String s2="HELLO";
		System.out.println(s1.equalsIgnoreCase(s2));
		if(s1.equalsIgnoreCase(s2)==true)
		System.out.println("both strings are matched");
		else
			System.out.println("both strings are not matched");
		
		
		
		

	}

}
