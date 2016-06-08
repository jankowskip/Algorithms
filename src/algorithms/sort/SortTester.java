package algorithms.sort;

import java.util.List;
import java.util.Random;

public class SortTester {

	public void executeSortAndPrint(List<Sort> list, int sizeOfArray) {
		System.out.println("Array to sort");
		int[] array = genereRandomArray(sizeOfArray);
		printList(array);
		for (Sort s : list) {
			int[] arrayTester = array.clone();
			System.out.println('\n' + "-----" + s.toString() + "----");
			long startTime = System.nanoTime();
			s.sort(arrayTester);
			long endTime = System.nanoTime();
			long time = endTime - startTime;
			printList(arrayTester);
			System.out.println('\n' + s.toString() + " needed " + String.format("%,d", time) + " ns to sort list");
		}
	}

	public void printList(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print("[" + array[i] + "] ");
		}
	}

	private int[] genereRandomArray(int size) {
		int[] randomArray = new int[size];
		Random r = new Random();
		for (int i = 0; i < size; i++) {
			randomArray[i] = r.nextInt(9) + 1;
		}
		return randomArray;
	}

}
