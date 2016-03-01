package auditorium.multithreading;



public class HiLowPriority {
    public static void main(String args[]) {
//        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
        Clicker hi = new Clicker(Thread.NORM_PRIORITY + 2);
        Clicker lo = new Clicker(Thread.NORM_PRIORITY - 2);
    }
}

// Demonstrate thread priorities.
class Clicker implements Runnable {
    long click = 0;
    Thread t;
    private volatile boolean running = true;

    public Clicker(int p) {
        t = new Thread(this);
        t.setPriority(p);
    }

    public void run() {
        System.out.println("current thread priority : " + Thread.currentThread().getPriority());
        while (running) {
            click++;
        }
    }

    public void stop() {
        running = false;
    }

    public void start() {
        t.start();
    }
}
