
public class feb042020 
{
	public static void main(String[] args) 
	{
		// Made Pyramid
		// step.1 half Pyramid

		for(int i=1;i<11;i++)
		{
			for(int k=1;k<=i;k++)
			{
				System.out.print("*");
			}
			System.out.print("\n");
		}
		System.out.println("\n"+"----" +"step. 1 end" +"----");
		//step.2 Reverse half Pyramid

		for(int i=0; i<11; i++)
		{
			for(int k=0; k<11-i; k++)
			{
				System.out.print("*");
			}
			System.out.print("\n");
		}

		//step.3 Real Pyramid
		for(int i=0; i<11; i++)
		{
			for(int k=0; k<11-i; k++)
			{
				System.out.print(" ");
			}
			for(int n=1;n<=2*i+1;n++)
			{
				System.out.print("*");
			}

			System.out.print("\n");
		}

		// I don't know made Real Pyramid about 2 hours ago.
		// but, I learning for Real Pyramid made and memorized.
	}

}
