package auditorium.thread;

public class ThreadDemo {

    public static void main(String[] args) throws InterruptedException {
        Thread main = Thread.currentThread();
        main.setPriority(Thread.MIN_PRIORITY);


        Runnable myThread = new MyThread();

        Thread t = new Thread(myThread);
        t.start();

        System.out.println("Start " + main.getName() + " thread");
        ExtendThread thread = new ExtendThread("My thread");
        thread.setPriority(Thread.MAX_PRIORITY);
        thread.start();
        for (int i = 0; i < 5; i++) {
            System.out.println(main.getName() + " " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        t.join();
//        try {
//            thread.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        System.out.println("End main thread");
    }
}




class ExtendThread extends Thread {


    public ExtendThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        System.out.println("Start thread" + getName());

        for (int i = 0; i < 5; i++) {
            System.out.println(this.getName() + " " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("End " + this.getName() + " thread");
    }
}

class MyThread implements Runnable {

    @Override
    public void run() {

        String name = Thread.currentThread().getName();

        System.out.println("Start " + name + " thread.");

        for (int i = 0; i < 5; i++) {
            System.out.println(name + " " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("End " + name + " thread.");

    }
}