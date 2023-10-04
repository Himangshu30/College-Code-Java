public class program25 {
    private int privateVariable = 10;
    public int publicVariable = 20;
    protected int protectedVariable = 30;

    public void getPrivateVariable() {
        System.out.println(privateVariable);
    }

    public void getPublicVariable() {
        System.out.println(publicVariable);
    }

    public void getProtectedVariable() {
        System.out.println(protectedVariable);
    }

    public static void main(String[] args) {
        program25 myClass = new program25();

       
        myClass.getPrivateVariable();

        // Accessing public variable directly
        System.out.println(myClass.publicVariable);

        // Accessing protected variable directly
        System.out.println(myClass.protectedVariable);
    }
}
