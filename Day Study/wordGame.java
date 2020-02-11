import java.util.Scanner;

class player
{
	Scanner scn=new Scanner(System.in);
	String Pname;    //name filed
	public player(String name)    //Got a player name and Constructor
	{
		Pname=name;
	}

	public String getWordFromUser()     //Got player's word
	{
		String answer=scn.next();
		return answer;
	}

	public boolean CheckSuccess(String fword, String bword)    //check game rule
	{
		int lastIndex=fword.length()-1;
		char lastChar=fword.charAt(lastIndex);
		char firstChar=bword.charAt(0);
		if (firstChar==lastChar) 
		{
			return true;
		}
		else
		{
			return false;
		}
		
	}
}

public class wordGame 
{
	public static void main(String[] args) 
	{
		/*
		 End-to-End Game made.
		 Class should make two, "wordgame" and "player".
		 "Player" must have Constructor, name filed, getWordFromUser(), CheckSuccess() 


		 Hint) String word="Father";
		       int lastIndex=word.length()-1;
		       char lastChar=word.charAt(lastIndex);
		       char firstChar=word.charAt(0);
		 */ 
		Scanner scn=new Scanner(System.in);
		System.out.print("How many People join this End-to-End game?>>");
		int Pnum=scn.nextInt();
		player[] Pl= new player[Pnum];    //make class Array.

		for(int i=0;i<Pl.length;i++)
		{
			System.out.print("Please input Player's name>>");
			String Pname=scn.next();
			Pl[i]=new player(Pname);    //send player name
		}

		System.out.println("First Word is \"Father\">>");

		String fword="Father";
		for(int i=0;i<Pl.length;i++,i=i%3)
		{
			System.out.print(Pl[i].Pname +">>");    //print player's name
			String bword=Pl[i].getWordFromUser();    //send to player's word
			if (Pl[i].CheckSuccess(fword, bword)==true)   // check game rule
			{
				fword=bword;
			}
			else
			{
				System.out.println("Wrong word!");
				System.out.println(Pl[i].Pname +"Player defeat");
				System.out.println(Pl[i].Pname +"Good Game!");
				break;
			}
		}

		scn.close();
	}

}
