import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import algorithms.basic.Factorial;
import algorithms.basic.Fibonacci;
import algorithms.basic.FuzzBuzz;
import algorithms.basic.StringAndChar;
import algorithms.sort.BubbleSort;
import algorithms.sort.InsertionSort;
import algorithms.sort.MergeSort;
import algorithms.sort.QuickSort;
import algorithms.sort.SelectionSort;
import algorithms.sort.ShellSort;
import algorithms.sort.Sort;
import algorithms.sort.SortTester;
import dataStructures.ArrayQueue;
import dataStructures.DynamicArray;
import dataStructures.DynamicArrayStack;
import dataStructures.LinkList;
import dataStructures.LinkStack;


public class Start {

	public static void main(String[] args) {
		// Sorting
		System.out.println("----------Sorting----------");
		Sort bubbleSort = new BubbleSort();
		Sort insertionSort = new InsertionSort();
		Sort selectionSort = new SelectionSort();
		Sort shellSort = new ShellSort();
		Sort mergeSort = new MergeSort();
		Sort quickSort = new QuickSort();
		List<Sort> sortList = new ArrayList<Sort>();
		sortList.addAll(Arrays.asList(bubbleSort, insertionSort, selectionSort, shellSort, mergeSort,quickSort));
		SortTester sortTester = new SortTester();
		sortTester.executeSortAndPrint(sortList, 20);


		
		
	}

}
