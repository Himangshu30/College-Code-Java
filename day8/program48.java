//WAP in Java to implement the stack using generic class

public class program48 {
    public static void main(String[] args) {
        Stack intstack = new Stack();

    
        intstack.push(10);
        intstack.push(20);
        intstack.push(30);

        System.out.println("Peek: " + intstack.peek());

       
        System.out.println("Pop: " + intstack.pop());
        System.out.println("Pop: " + intstack.pop());

        
        System.out.println("Is stack empty? " + intstack.isEmpty());

        // Pushing more elements
        intstack.push(40);
        intstack.push(50);

        // Displaying the stack
        System.out.println("Stack contents:");
        while (!intstack.isEmpty()) {
            System.out.println(intstack.pop());
        }
    }
}

