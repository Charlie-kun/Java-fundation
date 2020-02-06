
class ClassMethod 
{
	private void PrintStr(String str) 
	{
        System.out.println(str);
	}

	private void PrintStr(String str, int b)   //Same method name but different input data
	{
        for(int i=0;i<b;i++)
        {
        	System.out.print(str +"\t");	
        }		
	}
		
	public static void main(String[] args) 
	{
		/* 
		   Make a Method overLoading.	 
           Method receive a one string. 
           And screen display on "input string"
           Another method get input string and int.
           screen display on "input string" repeat int numbers.
		 */

		ClassMethod CM=new ClassMethod();
		
		CM.PrintStr("Super Man");
		CM.PrintStr("Bat Man", 3);


	}

}
