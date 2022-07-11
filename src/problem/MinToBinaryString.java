package problem;

/**
 * 1758
 *
 */
public class MinToBinaryString {
	/**
	 * only two forms: 101010... or 010101...
	 */
	public int minOperations(String s) {
		int a = 0;
		int b = 0;
		
		for (int i = 0; i < s.length(); i++) {
			// character matches form of 0101...
			if(s.charAt(i) == '0' + i % 2) {
				a ++;
			}
			// character matches form of 1010...
			else {
				b ++;
			}
		}
		return Math.min(a, b);
	}
}
