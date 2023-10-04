//Wap in java  to show the while loop structure in GUI based

import javax.swing.*;
import java.util.Scanner;

public class program13
{
	public static void main(String args[])
    	{
        	int temp = 0;
        	Scanner sc = new Scanner(System.in);
		
        	while(temp != -1000000)
        	{
            		int a = Integer.parseInt(JOptionPane.showInputDialog("Enter first number : "));
            		int b = Integer.parseInt(JOptionPane.showInputDialog("Enter second number : "));
			int opt = Integer.parseInt(JOptionPane.showInputDialog("Enter operation:\n 1: '+'\n 2: '-'\n 3: '*'\n 4: '/'\n 5: '%'\n -99: exit"));
            		
            		temp = operation(a, b, opt);
            		if(temp != -1000000) JOptionPane.showMessageDialog(null, "Result is " + temp);;
			

        	}
		JOptionPane.showMessageDialog(null, "program end");
    	}
	
	static int operation(int num1, int num2, int c)
    	{
        	if(c == -99) return -1000000;

        	switch (c) {
            		case 1: return (num1 + num2);
            		case 2: return (num1 - num2);
            		case 3: return (num1 * num2);
          		case 4: return (num1 / num2);
			case 5: return (num1 % num2);
		}
        	return 0;
	}
}
