//write  a program in java to show the use of method overloading

public class program20 {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        program20 math = new program20();

        // Using the add method with different parameter lists
        int sum1 = math.add(5, 3);
        double sum2 = math.add(2.5, 3.7);
        int sum3 = math.add(1, 2, 3);

        System.out.println("Sum of integers: " + sum1);
        System.out.println("Sum of doubles: " + sum2);
        System.out.println("Sum of three integers: " + sum3);
    }
}

 
