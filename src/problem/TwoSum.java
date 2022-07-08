package problem;

import java.util.HashMap;
import java.util.Map;

/**
 * 1
 *
 */
public class TwoSum {
	
	/**
	 * time: O(n^2)
	 * space: O(1)
	 */
	public int[] twosum(int[] nums, int target) {
		int[] answer = new int[2];
		for(int i = 0; i < nums.length; i ++) {
			answer[0] = i;
			for (int j = i + 1; j < nums.length; j ++) {
				if(nums[i] + nums[j] == target) {
					answer[1] = j;
					return answer;
				}
			}
		}
		return answer;
	}
	
	/**
	 * 
	 * time: O(n)
	 * space: O(n)
	 */
	public int[] twosumWithMap(int[] nums, int target) {
		int answer[] = new int[2];
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i ++) {
			if(map.containsKey(target - nums[i])){
				answer[0] = map.get(target - nums[i]);
				answer[1] = i;
			}
			map.put(nums[i], i);
		}
		return answer;
	}
}
