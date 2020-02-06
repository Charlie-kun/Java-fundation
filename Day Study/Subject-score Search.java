import java.util.Scanner;

public class Feb052020 
{
	public static void main(String[] args) 
	{
		/* Subject-score Search program
		 String Subject[]={"Java", "C#","HTML", "ComputerSci", "Android"}
		 int Score[]={85,90,45,50,70}

		 Your want to your subject score for check. 
		 So, you're searching for your subject name.
         like this. 

         Subject Name>> Java 
         Your Java score is 85. 
         Subject Name>>

         And, if your input wrong subject name. print down message.
         "Wrong Subject Name."
         if your want to program stop. 
         Input subject name "stop"

         //Hint
          Stirng name;   <--input Subjct name
          course[i].equals(name);     <-- Searching for name
		 */
		
		String Subject[]={"Java", "C#","HTML", "ComputerSci", "Android"};
		int Score[]={85,90,45,50,70};
		
		Scanner scn= new Scanner(System.in);
		String name="";
		int i;
		
		do{
			System.out.print("Subject Name>>");			
			name=scn.nextLine();
			
			for (i = 0; i < Subject.length; i++) 
			{
				if(Subject[i].equals(name)) 
				{
					System.out.println("Your " +Subject[i] +" score is " +Score[i]);
					break;
				}
			}
			if(i==Subject.length&&!name.equals("stop"))
			{
				System.out.println("Wrong Subject Name");
			}
			
		} while(!name.equals("stop"));
		System.out.println("Quit program");
		
		scn.close();
		
		
		
	}

}
