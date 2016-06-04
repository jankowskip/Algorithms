import algorithms.other.Factorial;
import algorithms.other.Fibonacci;
import algorithms.other.FuzzBuzz;
import algorithms.other.StringAndChar;

public class Start {

	public static void main(String[] args) {
		FuzzBuzz fuzz = new FuzzBuzz();
		System.out.println("----------FuzzBuzz Algorithm----------");
		fuzz.algorithm();
		System.out.println("----------Count chars in String Algorithm----------");
		StringAndChar sac = new StringAndChar();
		System.out.println(sac.checkString("ANakondA", 'A'));
		Factorial fac = new Factorial();
		System.out.println("----------Factorial Algorithm----------");
		System.out.println(fac.factorialIteration(0));
		System.out.println(fac.factorialRecursion(0));
		Fibonacci f = new Fibonacci();
		System.out.println("----------Fibonacci Algorithm----------");
		System.out.println(f.fibonacciIteration(19));
		System.out.println(f.fibonacciRecursion(19));
		f.createFibonacciList(19);
	}

}
