//Wap in java to throw throwable object from try and catch block


public class program40 {
    public static void main(String[] args) {
        try {
            throw new Throwable("This is a Throwable object");
        } catch (Throwable e) {
            System.out.println(e.getMessage());
        }
    }
}

