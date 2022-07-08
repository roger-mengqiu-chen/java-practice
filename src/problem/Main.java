package problem;

import java.util.Arrays;

public class Main {
	public static void main (String[] args) {
		TwoSum ts = new TwoSum();
		int[] arr = new int[] {1,2,2,5};
		int[] ans = ts.twosumWithMap(arr, 4);
		System.out.println(Arrays.toString(ans));
	}
}
