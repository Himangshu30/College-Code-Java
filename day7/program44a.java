class Producer implements Runnable {
    Q q;
    int maxCount;

    Producer(Q q, int maxCount) {
        this.q = q;
        this.maxCount = maxCount;
        new Thread(this, "Producer").start();
    }

    public void run() {
        int i = 0;
        while (i < maxCount) {
            q.put(i++);
        }
    }
}

class Consumer implements Runnable {
    Q q;
    int maxCount;

    Consumer(Q q, int maxCount) {
        this.q = q;
        this.maxCount = maxCount;
        new Thread(this, "Consumer").start();
    }

    public void run() {
        int count = 0;
        while (count < maxCount) {
            q.get();
            count++;
        }
    }
}

public class program44a {
    public static void main(String[] args) {
        Q q = new Q();
        int maxCount = 10; // Maximum number of items to produce/consume
        new Producer(q, maxCount);
        new Consumer(q, maxCount);
        
    }
}
