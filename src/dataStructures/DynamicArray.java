package dataStructures;

public class DynamicArray {
	private int[] data;
	private int size = 0;

	public DynamicArray() {
		data = new int[1];
	}

	public DynamicArray(int size) {
		data = new int[size];
	}

	public boolean remove(int index) {
		if (index >= size || index < 0) {
			return false;
		}
		if (index == size - 1) {
			data[index] = 0;
		} else {
			moveArray(index);
		}
		size--;
		return true;
	}
	
	public void trimToSize(){
		changeArrayLength(size);
	}

	public boolean add(int value) {
		if (data.length <= size) {
			int newLength = size * 2;
			changeArrayLength(newLength);
		}
		data[size] = value;
		size++;
		return true;
	}

	public boolean add(int index, int value) {
		if (index >= size || index < 0) {
			return false;
		}
		data[index] = value;
		return true;
	}

	private boolean changeArrayLength(int newLength) {
		int[] tempData = new int[newLength];
		copyArrayValues(tempData);
		data = tempData;
		return true;
	}

	private void copyArrayValues(int[] target) {
		for (int i = 0; i < size; i++) {
			target[i] = data[i];
		}
	}

	private void moveArray(int index) {
		for (int i = index + 1; i < size; i++) {
			data[i - 1] = data[i];
		}
	}

	private void checkRange(int index) {
		if (index >= size || index < 0) {
			throw new IndexOutOfBoundsException();
		}
	}
	
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for(int i=0; i<size;i++){
			sb.append(data[i]);
			if(i==size-1){
				sb.append("]");
			}
			else{
				sb.append(", ");
			}
		}
		return sb.toString();
	}
	

	public int get(int index) {
		checkRange(index);
		return data[index];
	}

	public int size() {
		return size;
	}

}
