import java.util.Scanner;  //using Scanner

public class Today 
{
	public static void main(String[] args) 
	{
		/*
		// Calculate Pool water Filling Time  
		float WidthPool, depthPool, lengthPool, volumPool, capasityPool, timePool;
		float rateFlow=50.0f;
		float capasity=7.48f;
		
		Scanner scn=new Scanner(System.in);		
		System.out.println("Please input Pool Width.(ft)");
		WidthPool=scn.nextFloat();
		
		System.out.println("Please input Pool length.(ft)");
		lengthPool=scn.nextFloat();
		
		System.out.println("Please input Pool depth.(ft)");
		depthPool=scn.nextFloat();
		
		volumPool=WidthPool*lengthPool*depthPool;
		capasityPool=capasity*volumPool;
		
		timePool=capasityPool/rateFlow;
		
		System.out.println("Water filling for "+timePool +"minutes");
		float sec=((timePool%1)*60);
		float min=(float)Math.floor(timePool%60);
		float hour=(float)Math.floor(timePool/60);
				
		
		System.out.printf("Water filling for " +"%.0f" +"hour" +"%.0f" +"minute"+"%.0f" +"second", hour, min, sec);
		*/
		
		//a to z write using do~while
		char A='a';    //ASCII code for 'a' is 97
		
		do {
			System.out.print(A);   //print a~z
			System.out.print((char)(A-32) +" ");    //print A~Z
			A++;
		} while (A<='z');
				
		
	}

}
