public class program42a {
    public static void main(String[] args) {
        AdderThread thread1 = new AdderThread(1, 500); // Thread 1 will add numbers from 1 to 500
        AdderThread thread2 = new AdderThread(501, 1000); // Thread 2 will add numbers from 501 to 1000

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int result = thread1.getSum() + thread2.getSum();
        System.out.println("The sum of numbers from 1 to 1000 is: " + result);
    }
}

class AdderThread extends Thread {
    private int start;
    private int end;
    private int sum = 0;

    public AdderThread(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public int getSum() {
        return sum;
    }

    @Override
    public void run() {
        for (int i = start; i <= end; i++) {
            sum += i;
        }
    }
}
