//Wap in java to show the use of method overloading.

class Car
{
	String name, color;
	Car(String a, String b)
    	{
        	name = a;
        	color = b;
    	}

}

public class program21
{	

	public static void main(String args[])
	{
		Car car = new Car("BMW", "Blue");
		print(car);
		
	}
	public static void print(Car c)
	{
		System.out.println(c.name);
		System.out.println(c.color);
	}


}
