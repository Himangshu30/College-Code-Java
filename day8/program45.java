//WAP in java to show that when you are calculating the summation of  numbers by two threads (assignment 42) the ti

public class program45 {
    public static void main(String[] args) {
        int n = 1000; // Adjust the range of numbers as needed

        // Single-threaded summation
        long startTimeSingleThread = System.currentTimeMillis();
        long sumSingleThread = calculateSumSingleThread(n);
        long endTimeSingleThread = System.currentTimeMillis();

        // Multi-threaded summation
        long startTimeMultiThread = System.currentTimeMillis();
        long sumMultiThread = calculateSumMultiThread(n);
        long endTimeMultiThread = System.currentTimeMillis();

        // Display results
        System.out.println("Single-threaded sum: " + sumSingleThread);
        System.out.println("Time taken (single-threaded): " + (endTimeSingleThread - startTimeSingleThread) + " milliseconds");

        System.out.println("\nMulti-threaded sum: " + sumMultiThread);
        System.out.println("Time taken (multi-threaded): " + (endTimeMultiThread - startTimeMultiThread) + " milliseconds");
    }

    private static long calculateSumSingleThread(int n) {
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    private static long calculateSumMultiThread(int n) {
        SumTask task1 = new SumTask(1, n / 2);
        SumTask task2 = new SumTask((n / 2) + 1, n);

        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return task1.getTotalSum() + task2.getTotalSum();
    }

    private static class SumTask implements Runnable {
        private int start;
        private int end;
        private long totalSum = 0;

        public SumTask(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public void run() {
            for (int i = start; i <= end; i++) {
                totalSum += i;
            }
        }

        public long getTotalSum() {
            return totalSum;
        }
    }
}

