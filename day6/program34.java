//Wap in java to create an interface and use that in a class
interface MyInterface {
    void displayMessage();
}


class MyClass implements MyInterface {
    @Override
    public void displayMessage() {
        System.out.println("This is the implementation of displayMessage() in MyClass.");
    }
}

public class program24 {
    public static void main(String[] args) {
        
        MyClass myObject = new MyClass();

        
        myObject.displayMessage();
    }
}

