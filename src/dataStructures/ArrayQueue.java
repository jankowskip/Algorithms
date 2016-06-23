package dataStructures;

import java.util.Arrays;

public class ArrayQueue {
	private int[] array;
	private int size = 0;
	private int front = 0;
	private int lenght;

	public ArrayQueue(int lenght) {
		array = new int[lenght];
		this.lenght = lenght;
	}

	public boolean enqueue(int value) {
		int index = (size + front) % lenght;
		if (index == front && size != 0) {
			return false;
		}
		array[index] = value;
		size++;
		return true;

	}

	public int dequeue() {
		if (size == 0) {
			throw new IndexOutOfBoundsException("Queue is empty");
		}
		size--;
		front++;
		return array[front - 1];
	}

	public String toString() {
		return Arrays.toString(array);
	}
}
