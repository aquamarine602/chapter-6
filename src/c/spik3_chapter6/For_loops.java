package c.spik3_chapter6;

public class For_loops {

	public static void main(String[] args) {
		
		// while loop
		int count = 0;	// sentry variable
		// while checks the condition then executes while condition evaluates to true
		while (count < 100) {
			// loop body
			System.out.println(count);
			count++;	// adjusted sentry variable
		}	// end loop body
		
		// do loop
		count = 0;	// sentry variable
		// do loops execute the loop body then checks the condition
		do {// start loop body
			// loop body
			System.out.println(count);
			count++;	// adjusted sentry variable
			
		} while (count < 100);	// the loop will continue as long as the condition is true
		
		// for loop
		// can be used to simplify the preceding loop
		// initial set up, condition, iteration
		for (int i = 0, j = 10; i == j; i++, j--) {
			System.out.println(i);
			System.out.println(j);
		}
		

	}

}
