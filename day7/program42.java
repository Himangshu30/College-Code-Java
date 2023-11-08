//Wap in java to add numbers from 1-1000 by two threads

public class program42 {
    	public static void main(String[] args)
	{
		int sum = 0;

		for (int i = 1; i <= 1000; i = i + 2)
		{
            		sum += i;
        	}

        	AddEvenThread thread1 = new AddEvenThread(1000);

        	thread1.start();

        	try
		{
            		thread1.join();        	}
		catch (InterruptedException e)
		{
            		System.out.println("Exception: " + e.getMessage());
        	}

        	int result = thread1.getSum() + sum;
        	System.out.println("The sum of numbers from 1 to 1000 is: " + result);
    	}
}

class AddEvenThread extends Thread
{
    	private int n;
	private int sum = 0;

    	public AddEvenThread(int n) {
        	this.n = n;
    	}

    	public int getSum()
	{
        	return sum;
    	}

    	
    	public void run()
	{
        	for (int i = 2; i <= n; i = i + 2)
		{
            		sum += i;
        	}
    	}
}

