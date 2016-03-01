package auditorium.hayk_kupalyan.dynamicarray;

public class DynamicArrayImpl<T> implements DynamicArray<T> {
	public static final int DEFAULT_CAPACITY = 16;

	private T[] values;
	private int size;

	public DynamicArrayImpl() {
		this(DEFAULT_CAPACITY);
	}

	public DynamicArrayImpl(int capacity) {
		values = (T[]) new Object[capacity];
		size = 0;
	}

	@Override
	public int size() {
		return size;
	}

	@Override
	public boolean isEmpty() {
		return size == 0;
	}

	@Override
	public boolean contains(T o) {
		return indexOf(o) > -1;
	}

	@Override
	public int indexOf(T o) {
		if (o == null) {
			return indexOfNull();
		} else {
			for (int i = 0; i < size; i++) {
				if (o.equals(values[i])) {
					return i;
				}
			}
			return -1;
		}
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
		//TODO  Elementary_Programming
		return 0;
	}

	@Override
	public T get(int index) {
		validateIndex(index);

		return values[index];
	}

	@Override
	public T set(int index, T element) {
		validateIndex(index);

		return null;
	}

	@Override
	public boolean add(T e) {
		// TODO insureCapcity

		values[size++] = e;
		return true;
	}

	@Override
	public void add(int index, T element) {
		validateIndex(index, true);

		// TODO insureCapcity

		//
	}

	@Override
	public T remove(int index) {
		validateIndex(index);

		T removedValue = values[index];
		for(int i = index; i < size-1; i++){
			values[i] = values[i+1];
		}
		values[--size] = null;
		return removedValue;
	}

	@Override
	public boolean remove(T o) {
		int index = indexOf(o);
		if(index > -1) {
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


	private void validateIndex(int index){
		validateIndex(index, false);
	}

	private void validateIndex(int index, boolean isLastIncluded){
		int lastindex = isLastIncluded? size: size-1;
		if(index < 0 || index > lastindex){
			throw new ArrayIndexOutOfBoundsException(index);
		}
	}


}
