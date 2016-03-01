package auditorium.sortbyoddpair;

import java.util.Random;

/**
 * Created by Karen on 25.02.2016.
 */
public class SortByOddPair {
    private static final int DEFAULT_SIZE = 20;
    private Integer[] intArray;
    private int size;

    public SortByOddPair() {
        intArray = new Integer[DEFAULT_SIZE];
        size = DEFAULT_SIZE;
        generateRandValues();
    }

    public SortByOddPair(int size) {
        intArray = new Integer[size];
        this.size = size;
        generateRandValues();
    }

    private void generateRandValues() {
        Random rn = new Random();
        for (int i = 0; i < size; i++) {
            intArray[i] = rn.nextInt(100);
        }
    }

    public void shortArray() {
        int flug = intArray[0] % 2;
        int index = 1;
        while (index < size) {
            //Swithch flug
            flug = (flug == 0) ? 1 : 0;
            if (intArray[index] % 2 == flug) {
                ++index;
                continue;
            }
            int m = getNextElementIndex(index, flug);
            if (m == -1) {
                return;
            }
            replaceElements(index, m);
            ++index;
        }
    }

    private int getNextElementIndex(int start, int flug) {
        for (int i = start; i < size; i++) {
            if (intArray[i] % 2 == flug) {
                return i;
            }
        }
        return -1;
    }

    private void replaceElements(int start, int end) {
        int tmp = intArray[end];
        for (int i = end; i > start; i--) {
            intArray[i] = intArray[i - 1];
        }
        intArray[start] = tmp;
    }

    public void log() {
        System.out.print("values: ");
        for (int i = 0; i < size; i++) {
            System.out.print(intArray[i] + " ");
        }
        System.out.println("\nsize: " + size);
    }
}
