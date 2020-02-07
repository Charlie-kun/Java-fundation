 class Car    //class
{
    int value=10000;    //Field

    public Car(String color, int cc)   //Constructor
    {
        system.out.println(color +"Car" +cc +"cc power!");
    }
    
    Car(String color, int cc, int model).   //Constructor Overload 
    {
        system.out.pirntln(model +"Car color is " +color +"and good spec" +cc +"CC!");
    }
    static void CarShow()
    {
        system.out.println(model +"Car color is " +color +"and good spec" +cc +"CC!" +value +"dollar!!")
    }
}

public static void main(String[] args)
{
    Car myCar=new Car("black", 3000);
    //Car myCar = new Car();    //Can't Calling basic Constructor
    
    Car myCar=new Car("White", 3000, "infinity");
}
