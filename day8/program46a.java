//WAP in Java which will take input from the command prompt and show that on screen


import java.util.*;
import java.io.*;
import java.util.Scanner;

public class program46a {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");
    }
}
