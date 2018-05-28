package leetcode.questions.practice;

import java.util.Arrays;
/**
 * SORTING TECHNIQUE
 * O(n*longn)
 * @author sunayan
 *
 */

public class ValidAnagram {

	public boolean isAnagram(String s, String t) {
		if (s.length() != t.length()) {
	        return false;
	    }
	    char[] str1 = s.toCharArray();
	    char[] str2 = t.toCharArray();
	    Arrays.sort(str1);
	    Arrays.sort(str2);
	    return Arrays.equals(str1, str2);
	}

	public static void main(String[] args) {
		ValidAnagram validity = new ValidAnagram();
		boolean result = validity.isAnagram("ab", "a");
		System.out.println(result);
	}

}
