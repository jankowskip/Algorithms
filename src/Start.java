import algorithms.other.Factorial;
import algorithms.other.FuzzBuzz;
import algorithms.other.StringAndChar;

public class Start {

	public static void main(String[] args) {
		FuzzBuzz fuzz = new FuzzBuzz();
		System.out.println("----------FuzzBuzz Algorithm----------");
		fuzz.algorithm();
		System.out.println("----------Count chars in String Algorithm----------");
		StringAndChar sac = new StringAndChar();
		System.out.println(sac.checkString("anakonda", 'A'));
		Factorial fac = new Factorial();
		System.out.println("----------Factorial Algorithm----------");
		System.out.println(fac.factorialIteration(4));
		System.out.println(fac.factorialRecursion(4));
	}

}
