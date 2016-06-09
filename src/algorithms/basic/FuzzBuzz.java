package algorithms.basic;

public class FuzzBuzz {

	public void algorithm() {
		for (int i = 1; i <= 100; i++) {
			if (i % 3 == 0 && i%5 ==0 ) { //%15
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
