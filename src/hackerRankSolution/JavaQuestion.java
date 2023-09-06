package hackerRankSolution;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class JavaQuestion {

	public static void main(String[] args) {
		/* Integer number, function return lambda.apply(number) */

		int number = 10;
		Function<Integer, Integer> square = n -> n * n;
		int result = square.apply(number);
		System.out.println("Result: " + result); // Output: Result: 100

		/*
		 * List<String> songTitles = Arrays.asList("humble", "element", "dna"); _____
		 * capitalize = str ->str.toUpperCase();
		 * songTitles.stream().map(capitalize).forEach(System.out::println);
		 */
		List<String> songTitles = Arrays.asList("humble", "element", "dna");
		Function<String, String> capitalize = str -> str.toUpperCase();
		songTitles.stream().map(capitalize).forEach(System.out::println);

		/*
		 * List<Integer> numbers = List.of(1,2,3,4); int total = 0;
		 * 
		 * for (Integer x : numbers) { if (x % 2 == 0) total += x * x; } Which
		 * expression is a functional equivalent?
		 */

		List<Integer> numbers = List.of(1, 2, 3, 4);

		int total = numbers.stream().filter(x -> x % 2 == 0).mapToInt(x -> x * x).sum();
		System.out.println("total: " + total);

		
	}

}
