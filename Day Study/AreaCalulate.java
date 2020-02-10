
public class AreaCalulate 
{
	int x,y;
	public AreaCalulate(int x, int y)
	{
		this.x=x;
		this.y=y;
	}
    public void areaPrint()
    {
    	System.out.println(x +" , " +y +":" +(x*y));
    }
	
	public static void main(String[] args) 
	{
		/*
		 Made Calculation area class "AreaCalulate"
		 Condition : Two member variable, Constructor has a two parameter,
		             Must have print to method "areaPrint()"
		 Hint : AreaCalulate tt=new triangle(5,4); AreaCalulate ss =new square(2,3);

		 */
		
		AreaCalulate tt =new triangle(5,4);    //up scale
		AreaCalulate ss =new square(2,3);
		
		tt.areaPrint();
		ss.areaPrint();

	}

}

class triangle extends AreaCalulate
{
	public triangle(int a, int b) 
	{
		super(a, b);        //parent AreaCalulate Link
	}
	
	public void areaPrint()    //OverRide 
	{
		System.out.println(x +" , " +y +":" +(x*y/2));
	}
}

class square extends AreaCalulate
{
	public square(int a, int b) 
	{
		super(a, b);        //parent AreaCalulate Link
	}
	
	public void areaPrint()    //OverRide 
	{
		super.areaPrint();    //parent AreaCalulate Link
	}
}