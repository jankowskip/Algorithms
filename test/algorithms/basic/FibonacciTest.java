package algorithms.basic;

import static org.junit.Assert.*;

import org.junit.Test;

public class FibonacciTest {

	@Test
	public void testFibonacciRecursion() {
		Fibonacci f = new Fibonacci();
		assertEquals("error in fibonacciRecursion for argument 46", 1836311903, f.fibonacciRecursion(46));
		assertEquals("error in fibonacciRecursion for argument 0", 0, f.fibonacciRecursion(0));
	}

	@Test(expected = IllegalArgumentException.class)
	public void testArgumentTooBigFibonacciRecursion() {
		Fibonacci f = new Fibonacci();
		f.fibonacciRecursion(100);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testArgumentTooSmallFibonacciRecursion() {
		Fibonacci f = new Fibonacci();
		f.fibonacciRecursion(-10);
	}

	@Test
	public void testDynamicFibonacci() {
		Fibonacci f = new Fibonacci();
		assertEquals("error in fibonacciRecursion for argument 46", 1836311903, f.dynamicFibonacci(46));
		assertEquals("error in fibonacciRecursion for argument 0", 0, f.dynamicFibonacci(0));
	}

	@Test
	public void testDynamicFibonacciTime() {
		Fibonacci f = new Fibonacci();
		long firstCalculationTime = dynamicFibonacciTime(f);
		for(int i=0;i<11;i++){
			long nextCalculationTime = dynamicFibonacciTime(f);
			if (firstCalculationTime <= nextCalculationTime) {
				fail("dynamic optimization doesnt work");
			}
		}
	}

	private long dynamicFibonacciTime(Fibonacci f) {
		long startTime = System.nanoTime();
		f.dynamicFibonacci(46);
		long endTime = System.nanoTime();
		long calculationTime = endTime - startTime;
		return calculationTime;
	}

	@Test(expected = IllegalArgumentException.class)
	public void testArgumentTooBigFibonacciDynamic() {
		Fibonacci f = new Fibonacci();
		f.dynamicFibonacci(100);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testArgumentTooSmallFibonacciDynamic() {
		Fibonacci f = new Fibonacci();
		f.dynamicFibonacci(-10);
	}

	@Test
	public void testFibonacciIteration() {
		Fibonacci f = new Fibonacci();
		assertEquals("error in fibonacciRecursion for argument 46", 1836311903, f.fibonacciIteration(46));
		assertEquals("error in fibonacciRecursion for argument 0", 0, f.fibonacciIteration(0));
	}

	@Test(expected = IllegalArgumentException.class)
	public void testArgumentTooBigFibonacciIteration() {
		Fibonacci f = new Fibonacci();
		f.fibonacciIteration(100);
	}

	@Test(expected = IllegalArgumentException.class)
	public void testArgumentTooSmallFibonacciIteration() {
		Fibonacci f = new Fibonacci();
		f.fibonacciIteration(-10);
	}

}
