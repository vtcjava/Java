package auditorium.interfaces;

/**
 * Company: WeDooApps
 * Date: 11/22/15
 *
 * Created by Adam Madoyan.
 */

public class Stack implements StackInterface {


    public static final int DEFAULT_CAPACITY = 16;

    private int[] storage;

    private int tos;

    public Stack() {
        this(DEFAULT_CAPACITY);
    }

    public Stack(int capacity) {
        storage = new int[capacity];
        tos = -1;
    }

    @Override
    public void push(int value) {
        if (isFull()) {
            System.out.println("The stack is full.");
            return;
        }
        storage[++tos] = value;
    }

    @Override
    public int pop() {
        if (isEmpty()) {
            System.out.println("The stack is empty.");
            return -10;
        }
        return storage[tos--];
    }

    @Override
    public boolean isEmpty() {
        return tos < 0;
    }

    @Override
    public boolean isFull() {
        return tos >= storage.length - 1;
    }

    public void test() {
        System.out.println("vochmiban");
    }

}
