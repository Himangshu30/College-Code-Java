//Wap in java to show the use of Multiple catch block

public class program38 {
    public static void main(String[] args) {
        try {
            int a = 10;
            int b = 0;
            int c = a / b;

            // This will throw an ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException occurred: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected exception occurred: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed");
        }
    }
}


