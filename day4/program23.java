//wap to show the call by reference


public class program23{

    public static void main(String[] args) {
        int a = 10;
        changeA(a);

        System.out.println("a= " + a);
    }

    public static void changeA(int a) {
        a = a + 10;
    }
}
