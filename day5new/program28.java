

import java.io.*;

class Employee {
	int salary = 45000
}


class Engineer extends Employee {
	int benefits = 9000;
}

// Driver Class
public class program28{
	public static void main(String args[])
	{
		Engineer E1 = new Engineer();
		System.out.println("Salary : " + E1.salary
						+ "\nBenefits : " + E1.benefits);
	}
}
