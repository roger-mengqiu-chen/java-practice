package problem;

import java.util.Arrays;

/**
 * 821
 *
 */
public class ShortestToChar {
	
	/**
	 * time: O(N)
	 * space: O(N)
	 */
	public int[] shortestToChar(String s, char c) {
		int len = s.length();
        int[] ans = new int[len];
        
        // from left to right. Check distance to the last found target
        // to prevent overflow, using / 2
        int prev = Integer.MIN_VALUE / 2;
        for (int i = 0; i < len; i++) {
        	if (s.charAt(i) == c) prev = i;
        	ans[i] = i - prev;
        }
        
        // from right to left. Check distance to the last found target
        prev = Integer.MAX_VALUE / 2;
        for (int i = len - 1; i >= 0; i --) {
        	if (s.charAt(i) == c) prev = i;
        	// compare with exited distance, get smaller one
        	ans[i] = Math.min(prev - i, ans[i]);
        }
        
        return ans;
    }
	
}
