package hackerRankSolution;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SumArray {

	public static void main(String[] args) {
		//Sum all the values in a list in java 8
		List<Integer> arrays = Arrays.asList(new Integer[] { 1, 2, 3 });
		int sum = arrays.stream().collect(Collectors.summingInt(Integer::intValue));
		System.out.print(sum);
	}

}
