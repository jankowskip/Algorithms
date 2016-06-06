import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import algorithms.other.Factorial;
import algorithms.other.Fibonacci;
import algorithms.other.FuzzBuzz;
import algorithms.other.StringAndChar;
import algorithms.sort.BubbleSort;
import algorithms.sort.InsertionSort;
import algorithms.sort.SelectionSort;
import algorithms.sort.ShellSort;
import algorithms.sort.Sort;
import algorithms.sort.SortTester;

public class Start {

	public static void main(String[] args) {
		// Other
		FuzzBuzz fuzz = new FuzzBuzz();
		System.out.println("----------FuzzBuzz Algorithm----------");
		fuzz.algorithm();
		System.out.println("----------Count chars in String Algorithm----------");
		StringAndChar sac = new StringAndChar();
		System.out.println(sac.checkString("ANakondA", 'A'));
		Factorial fac = new Factorial();
		System.out.println("----------Factorial Algorithm----------");
		System.out.println("Iteration: " + fac.factorialIteration(3));
		System.out.println("Recursion: " + fac.factorialRecursion(3));
		Fibonacci f = new Fibonacci();
		System.out.println("----------Fibonacci Algorithm----------");
		System.out.println("Iteration: " + f.fibonacciIteration(5));
		System.out.println("Recursion: " + f.fibonacciRecursion(4));
		f.createFibonacciList(5);

		// Sorting
		System.out.println("----------Sorting----------");
		Sort bubbleSort = new BubbleSort();
		Sort insertionSort = new InsertionSort();
		Sort selectionSort = new SelectionSort();
		Sort shellSort = new ShellSort();
		List<Sort> list = new ArrayList<Sort>();
		list.addAll(Arrays.asList(bubbleSort, insertionSort, selectionSort, shellSort));
		SortTester sortTester = new SortTester();
		sortTester.executeSortAndPrint(list, 100);

	}

}
