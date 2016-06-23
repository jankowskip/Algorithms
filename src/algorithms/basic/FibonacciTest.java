package algorithms.basic;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class FibonacciTest {
	Fibonacci f = new Fibonacci();
	int result;

	@Test
	public void testFibonacciRecursion() {
		result = f.fibonacciRecursion(46);
		assertEquals("error in fibonacciRecursion for argument 46", result, 1836311903);
		result = f.fibonacciRecursion(0);
		assertEquals("error in fibonacciRecursion for argument 0", result, 0);
		result = f.fibonacciRecursion(-10);
		assertEquals("error in fibonacciRecursion for argument -10", result, 0);
		result = f.fibonacciRecursion(100);
		assertEquals("error in fibonacciRecursion for argument 100", result, 0);
	}

	@Test
	public void testDynamicFibonacci() {
		long startTime = System.nanoTime();
		result = f.dynamicFibonacci(46);
		long endTime = System.nanoTime();
		long firstCalculationTime = endTime - startTime;
		assertEquals("error in fibonacciRecursion for argument 46", result, 1836311903);
		result = f.dynamicFibonacci(0);
		assertEquals("error in fibonacciRecursion for argument 0", result, 0);
		result = f.dynamicFibonacci(-10);
		assertEquals("error in fibonacciRecursion for argument -10", result, 0);
		result = f.dynamicFibonacci(100);
		assertEquals("error in fibonacciRecursion for argument 100", result, 0);
		startTime = System.nanoTime();
		result = f.dynamicFibonacci(46);
		endTime = System.nanoTime();
		long secondCalculationTime = endTime - startTime;
		if (firstCalculationTime <= secondCalculationTime) {
			fail("dynamic optimization doesnt work");
		}
	}

	@Test
	public void testFibonacciIteration() {
		result = f.fibonacciIteration(46);
		assertEquals("error in fibonacciRecursion for argument 46", result, 1836311903);
		result = f.fibonacciIteration(0);
		assertEquals("error in fibonacciRecursion for argument 0", result, 0);
		result = f.fibonacciIteration(-10);
		assertEquals("error in fibonacciRecursion for argument -10", result, 0);
		result = f.fibonacciIteration(100);
		assertEquals("error in fibonacciRecursion for argument 100", result, 0);
	}

}
