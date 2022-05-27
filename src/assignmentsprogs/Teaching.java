package assignmentsprogs;

class Teacher {
	String designation="teacher";
	String collegeName="Beginners Book";
	void does()
	{
		System.out.println("teacher teaches lesson");
	}
}
	class Computerteacher extends Teacher {
		String subject1="computer";
		String collegename1="readersBook";
		void doing()
		{
			System.out.println("computer teacher teaches computer ");
			

		
			
			

		}
	}
		public class Teaching
		{
			public static void main(String[] args)
			{
				Computerteacher cobj=new Computerteacher();
				cobj.designation=" ";
				cobj.subject1 ="";
				cobj.doing();
	            cobj.does();
	            cobj.collegename1=" ";
	            cobj.collegeName="";
	            
				
			}
		

	}

			
	
	
	



