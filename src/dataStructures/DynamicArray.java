package dataStructures;

import java.util.Arrays;

public class DynamicArray {
	private int[] data;
	private int size;

	public DynamicArray() {
		data = new int[1];
		this.size = 0;
	}

	public DynamicArray(int size) {
		data = new int[size];
		this.size = 0;
	}

	public void add(int value) {
		if (data.length <= size) {
			int newLength = size * 2;
			int[] tempData = new int[newLength];
			copyArrayValues(data, tempData);
			data = tempData;
		}
		data[size] = value;
		size++;
	}

	public void add(int index, int value) {
		checkRange(index);
		data[index] = value;
	}

	private void copyArrayValues(int[] source, int[] target) {
		for (int i = 0; i < source.length; i++) {
			target[i] = source[i];
		}
	}

	public void checkRange(int index){
		if(index < size || index < 0){
			throw new IndexOutOfBoundsException();
		}
	}
	
	
	public void printArray(){
		System.out.print('\n' + "[");
		for(int i=0; i<size;i++){
			if(i==size-1){
				System.out.print(data[i] + "]");
			} else {
			System.out.print(data[i] + ", ");
			}
		}
	}

	public void printRealArray() {
		System.out.println(Arrays.toString(data));
	}

	public int get(int index) {
		return data[index];
	}
	
	public int size() {
		return size;
	}

}
