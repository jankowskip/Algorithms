package algorithms.other;

public class FuzzBuzz {

	public void algorithm() {
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i%5 ==0 ) {
				System.out.println("FuzzBuzz");
			}
			 if (i % 3 == 0) {
				System.out.println("Fuzz");
			 }
			 if (i % 5 == 0) {
				System.out.println("Buzz");
			}
			else {
				System.out.println(i);
			}
			
		}
		
	}

}
//oddity: "%" it's not a modulo operator it's a remainder operator
// differences between modulo and remainder: https://blogs.msdn.microsoft.com/ericlippert/2011/12/05/whats-the-difference-remainder-vs-modulus/