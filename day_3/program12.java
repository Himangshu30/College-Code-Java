//Wap in java to show the use of nested if-else selection structure.
public class  program12{
    public static void main(String[] args){
      int number = 10;

        if (number > 0) {
            if (number < 100) {
                System.out.println("The number is positive and less than 100.");
            } else {
                System.out.println("The number is positive and greater than or equal to 100.");
            }
        } else {
            System.out.println("The number is negative.");
        }
    }
}
