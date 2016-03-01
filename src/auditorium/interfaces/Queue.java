package auditorium.interfaces;

/**
 * Company: WeDooApps
 * Date: 11/22/15
 *
 * Created by Adam Madoyan.
 */


public class Queue implements StackInterface {

    public static final int DEFAULT_CAPACITY = 16;

    private int[] storage;

    private int tos;

    private int size;

    public Queue() {
        this(DEFAULT_CAPACITY);
    }

    public Queue(int capacity) {
        storage = new int[capacity];
        tos = -1;
        size = 0;
    }

    @Override
    public void push(int value) {
        if (isFull()) {
            System.out.println("The queue is full.");
            return;
        }
        storage[size++] = value;
    }

    @Override
    public int pop() {
        if (isEmpty()) {
            System.out.println("The queue is empty.");
            return -10;
        }
        return storage[++tos];
    }

    @Override
    public boolean isEmpty() {
        return tos + 1 >= size;
    }

    @Override
    public boolean isFull() {
        return size >= storage.length;
    }

    public void test() {
        System.out.println("vochmiban!!!!!!!!!!!!!");
    }


}