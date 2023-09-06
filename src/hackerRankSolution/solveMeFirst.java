package hackerRankSolution;

import java.util.Scanner;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;

public class solveMeFirst {

	/*
	 * Complete the function solveMeFirst to compute the sum of two integers.
	 * Example a=7 and b=3 Return 10. Function Description Complete the solveMeFirst
	 * function in the editor below. solveMeFirst has the following parameters: int
	 * a: the first value int b: the second value Returns - int: the sum of a and b
	 * Constraints 1<=a,b<=1000 Sample Input a = 2 b = 3 Sample Output 5
	 */

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int val1 = scanner.nextInt();
		int val2 = scanner.nextInt();
		scanner.close();
		// the condition
		Predicate<Integer> condition = x -> x > 1;
		//Function that sum a and b with the conditions
		BinaryOperator<Integer> sumFunction = (a, b) -> condition.test(a) && condition.test(b) ? a + b : 0;
		System.out.println(sumFunction.apply(val1, val2));
	}
}
