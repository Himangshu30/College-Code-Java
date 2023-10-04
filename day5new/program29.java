//wap in java to show the 
class vehicle {
    int maxSpeed = 120;
}
 
// sub class Car extending vehicle
class Car extends vehicle {
    int maxSpeed = 180;
 
    void display()
    {
        // print maxSpeed of base class (vehicle)
        System.out.println("Maximum Speed: "
                           + super.maxSpeed);
    }
}
 
// Driver Program
public class program29 {
    public static void main(String[] args)
    {
        Car small = new Car();
        small.display();
    }
}
