//Wap in java to add numbers from 1-1000 by two threads

public class program42c {
    public static void main(String[] args) {
        int n = 1000;
        int sum = 0;

        // Create a thread to add even numbers
        Thread evenThread = new Thread(() -> {
            for (int i = 2; i <= n; i += 2) {
                sum += i;
            }
        });

        // Start the even thread
        evenThread.start();

        // Add odd numbers in the main thread
        for (int i = 1; i <= n; i += 2) {
            sum += i;
        }

        try {
            // Wait for the even thread to complete
            evenThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Sum of numbers from 1 to 1000: " + sum);
    }
}
