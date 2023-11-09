////WAP in Java to implement the stack using generic class

import java.util.EmptyStackException;



class Stack<T> {

    private static class Node<T> {

        private T data;

        private Node<T> next;



        private Node(T data) {

            this.data = data;

        }

    }



    private Node<T> top;



    public void push(T item) {

        Node<T> newNode = new Node<>(item);

        newNode.next = top;

        top = newNode;

    }



    public T pop() {

        if (isEmpty()) {

            throw new EmptyStackException();

        }

        T popped = top.data;

        top = top.next;

        return popped;

    }



    public T peek() {

        if (isEmpty()) {

            throw new EmptyStackException();

        }

        return top.data;

    }



    public boolean isEmpty() {

        return top == null;

    }

}



public class Stk {

    public static void main(String[] args) {

        Stack<Integer> intStack = new Stack<>();



        intStack.push(10);

        intStack.push(20);

        intStack.push(30);



        System.out.println("Popped: " + intStack.pop());

        System.out.println("Peek: " + intStack.peek());



        Stack<String> stringStack = new Stack<>();



        stringStack.push("Hello");

        stringStack.push("Stack");

        stringStack.push("Example");



        System.out.println("Popped: " + stringStack.pop());

        System.out.println("Peek: " + stringStack.peek());

    }

}



