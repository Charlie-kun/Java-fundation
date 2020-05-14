public class StringEqualsExample
{  
  public static void main(String[] args) 
  {
    String strVar1="charlie";
    String strVar2="charlie";

    if(strVar1 == strVar2)
    {
      System.out.println("strVar1 and StrVar2 is same reference.");
    }else
    {
      System.out.println("strVar1 and strVar2 is different reference.");
    }

    if(strVar1.equals(strVar2))
    {
      System.out.println("strVar1 and strVar2 is same string.");
    }

    String strVar3 = new String("charlie");
    String strVar4 = new String("charlie");

    if(strVar3 == strVar4)
    {
      System.out.println("strVar3 and strVar4 is same refernce");
    }else
    {
      System.out.println("strVar3 and strVar4 is different refernce");
    }
  
    if(strVar3.equals(strVar4))
    {
      System.out.println("strVar3 and strVar4 is sma string.");
    }
    
  }
}
