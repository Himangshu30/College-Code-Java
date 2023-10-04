//Wap in java to show call by value.


public class program22 {
    public static void main(String[] args) {
        int num = 10;
        System.out.println("before changeValue method: " + num);

        
        changeValue(num);

        System.out.println("after changeValue method: " + num);
    }

    public static void changeValue(int x) {
        x = x * 2;
        System.out.println("Inside changeValue method: " + x);
    }
}
