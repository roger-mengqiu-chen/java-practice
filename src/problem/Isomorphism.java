package problem;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * 
 * Given two strings s and t, determine if they are isomorphic.

 * Two strings s and t are isomorphic if the characters in s can be replaced to get t.

 * All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.
 *
 */
public class Isomorphism {
	public boolean isIsomorphic(String s, String t) {
		return getSolution(s, t);
	}
	
	/**
	 * time O(N), space O(1)
	 * @param s
	 * @param t
	 * @return
	 */
	public boolean getSolution(String s, String t) {
		int[] mappingDictStoT = new int[256];
		Arrays.fill(mappingDictStoT, -1);
		int[] mappingDictTtoS = new int[256];
		Arrays.fill(mappingDictTtoS, -1);
		
		for(int i = 0; i < s.length(); i ++) {
			char c1 = s.charAt(i);
			char c2 = t.charAt(i);
			
			if(mappingDictStoT[c1] == -1 && mappingDictTtoS[c2] == -1) {
				mappingDictStoT[c1] = c2;
				mappingDictTtoS[c2] = c1;
			}
			
			else if (!(mappingDictStoT[c1] == c2 && mappingDictTtoS[c2] == c1)) {
				return false;
			}
		}
		
		return true;
	}
	
	/**
	 * time O(N), space O(N)
	 * @param s
	 * @return
	 */
	private String transform(String s) {
		Map<Character, Integer> indexMapping = new HashMap<>();
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < s.length(); i++) {
			char c1 = s.charAt(i);
			
			if(!indexMapping.containsKey(c1)) {
				indexMapping.put(c1, i);
			}
			
			sb.append(Integer.toString(indexMapping.get(c1)));
			sb.append(" ");
			
		}
		return sb.toString();
		
	}
	
	public boolean getSolution2(String s, String t) {
		return transform(s).equals(transform(t));
	}
}
