package auditorium.dynamicarray;

import java.util.Objects;

public class DynamicArrayImpl<T> implements DynamicArray<T> {
    public static final int DEFAULT_CAPACITY = 16;

    private Object[] values;
    private int size = 0;

    public DynamicArrayImpl() {
        values = new Object[DEFAULT_CAPACITY];
    }

    public DynamicArrayImpl(int capacity) {
        values = new Object[capacity];
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return (-1 == size);
    }

    @Override
    public boolean contains(T o) {
        return (this.indexOf(o) != -1);
    }

    @Override
    public int indexOf(T o) {
        for (int i = 0; i < size; i++) {
            if (values[i].equals(o)) {
                return i;
            }
        }
        return -1;
    }

    private int indexOfNull() {
        for (int i = 0; i < size; i++) {
            if (null == values[i]) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(T o) {
        for (int i = size - 1; i >= 0; i--) {
            if (o.equals(values[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public T get(int index) {
        if (!isValidIndex(index)) {
            return null;
        }
        return (T) values[index];
    }

    @Override
    public T set(int index, T element) {
        if (!isValidIndex(index)) {
            return null;
        }
        values[index] = element;
        return (T) values[index];
    }

    @Override
    public boolean add(T e) {
        insureCapacity();
        values[size++] = e;
        return true;
    }

    @Override
    public void add(int index, T element) {
        insureCapacity();
        if (isValidIndex(index)) {
            for (int i = size; i > index; i--) {
                values[i] = values[i - 1];
            }
            values[index] = element;
            ++size;
        }
    }

    @Override
    public T remove(int index) {
        if (!isValidIndex(index)) {
            return null;
        }
        T removedElement = (T) values[index];
        for (int i = index; i < size - 1; i++) {
            values[i] = values[i + 1];
        }
        values[--size] = null;
        return removedElement;
    }

    @Override
    public boolean remove(T o) {
        int index = indexOf(o);
        if (index >= 0) {
            remove(index);
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder buff
                = new StringBuilder("DynamicArrayImpl { size=" + size + ",\nvalues[\n");
        for (int i = 0; i < size; i++) {
            buff.append(values[i] + ",\n");
        }
        buff.append(" ]\n}");
        return buff.toString();

    }

    private boolean isValidIndex(int index) {
        if (index >= 0 && index < size) {
            return true;
        } else {
            System.out.println("Error! Index = " + index + ". Index should be in the range of [" + 0 + "," + (size - 1) + "]");
        }
        return false;
    }

    private void insureCapacity() {
        try {
            T tmp = (T) values[size];
        } catch (ArrayIndexOutOfBoundsException e) {
            Object[] tmpObj = new Object[size + size / 3];
            for (int i = 0; i < size; i++) {
                tmpObj[i] = values[i];
            }
            values = tmpObj;
        }

    }
}
