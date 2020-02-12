
public class FindEmptySpace 
{
	public static void main(String[] args) 
	{
		// Find Empty Space index number in string.
		// "Java program creates many objects."
		
		String s1="Java program creates many objects. ";
		int i=0;
		while(i<s1.length())
		{
			i=s1.indexOf(" ", i);    //This is String class method. it means find  "empty space" in String.  
			                         //From 'i'th index to end.  
			if(i<0)
			{
				break;    //Escape for loop
			}
			else 
			{
				System.out.print(i +"\t");
				i++;     //search about i+1 index number
			}
		}

	}

}
