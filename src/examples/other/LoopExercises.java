package examples.other;

import java.util.*;

/**
 * Loop exercises (while, for)
 */
public class LoopExercises {

	public static void main(String[] args) {

		// NOTE:
		// If you want to make it a bit more difficult,
		// solve each exercise with a function that returns a value or a list of values.
		// Also add tests for them. See the following function:

		performTests();

		// 1. Write a loop that prints the numbers from 1 to 5

		int a = 1;

		while (a <= 5){
			System.out.print( a + ",");
			a++;
		}
		System.out.println();

		// 2. Write a loop that prints the numbers from `start` to `end`

		int start;
		int end = 7;

		for ( start = 0; start <= end; start++ ){
			System.out.print(start + ",");
		}
		System.out.println();


		// 3. Write a loop that prints the even numbers from 1 to 10 (i.e. 2, 4, 6, 8, 10)

		int max = 10;

		for ( int even = 0; even < max; even++ ){
			if (even % 2 == 0){
				System.out.print(even + ",");
		}


		}
		System.out.println();


		// 4. Write a loop that prints the odd numbers from 1 to 10 (i.e. 1, 3, 5, 7, 9)

		int limit = 10;

		for (int odd = 0; odd < limit; odd++){
			if (odd % 2 == 0){
			}else{
				 System.out.print(odd + ",");
			 }

		}
		System.out.println();

		// 5. Write a loop that calculates the sum of the numbers from 1 to 10 (i.e. 1 + 2 + 3 + 4 + ... + 10 )

		int sum = 0;

		for (int i = 1; i <= 10; i++){
			sum = sum + i;
			System.out.print(sum + ",");
		}
		System.out.println();

		// 6. Write a loop that calculates the sum of the even numbers from 1 to 10 (i.e. 2 + 4 + ... + 10 )

		int sumeven = 0;

		for (int i = 1; i <= 10; i++){
			if (i % 2 == 0){
				sumeven = sumeven + i;
				System.out.print(sumeven + ",");
			}
		}
		System.out.println();

		// 7. Using a loop, calculate the power of 2^20 (i.e 2 * 2 * 2 * ... * 2, 20 times)

		int counter = 1;
		int result = 1;
		int value = 2;

		while ( counter <= 20 ){
			result = result * value;
			counter++;
			System.out.print( result + ",");

		}
		System.out.println();

		// 8. Calculate the factorial of 10 (ie. 1 * 2 * 3 * 4 * ... * 10)

		int counter2 = 1;
		int result2 = 1;

		while ( counter2 <= 10){
			result2 = result2 * counter2;
			counter2++;
			System.out.print(result2 + ",");
		}
		System.out.println();

		// 9. Loop from 1 to 100 and print only the numbers that are multiple of 5.


		for ( int w = 1; w <= 100; w++){
			if ( w % 5 == 0){
				System.out.print(w + ",");
				w++;
			}
		}
		System.out.println();


		//    You can use the `remainder` operator: if n % 5 == 0 it means that n is multiple of 5.
		//    More difficult: don't use the `remainder` operator.


		// 10. Calculate the 10th fibonacci number


		int r = 0;
		int t = 1;

		for ( int counter3 = 0; counter3 <= 10; counter3++){
			int sum1 = r + t;
			r = t;
			t = sum1;

			System.out.print(sum1 + ",");
		}
		System.out.println();

		//     The first fibonacci number is 0
		//     The second fibonacci number is 1
		//     From the third fibonacci number, it is calculated by adding the previous 2 numbers.
		//     So the third is 0+1=1, the fourth is 1+1=2, the fifth is 1+2=3, the sixth is 2+3=5, and so on.
		//     https://en.wikipedia.org/wiki/Fibonacci_number
	}





	// ----- Advanced ----- //


	/**
	 * 2. Write a loop that prints the numbers from `start` to `end`
	 *
	 * Note:
	 * This exercise is already solved with a function.
	 * Instead of printing the numbers, we return a list of those numbers.
	 */
	private static List<Integer> numbersFromStartToEnd(int start, int end) {

		List<Integer> result = new ArrayList<>();

		for (int i = start; i <= end; i++) {
			result.add(i);
		}

		return result;
	}


	/** Performs the tests for the functions */
	private static void performTests() {

		assertEquals( numbersFromStartToEnd(1, 5), Arrays.asList(1, 2, 3, 4, 5) );
		assertEquals( numbersFromStartToEnd(-3, 2), Arrays.asList(-3, -2, -1, 0, 1, 2) );

		// TODO: add tests for your functions here
	}

	// ---------------

	/**
	 * Checks that the two values are equal and throws an error if not
	 */
	private static void assertEquals(Object actual, Object expected) {

		if (!actual.equals(expected)) {
			throw new RuntimeException(
					"Values are not equal!" + "\n"
							+ "Actual: " + actual + "\n"
							+ "Expected: " + expected + "\n"
			);
		}
	}
}