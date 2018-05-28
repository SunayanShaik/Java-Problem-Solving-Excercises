package leetcode.questions.practice;

import java.util.Arrays;
/** Recursion solution is available at below link :
 * https://leetcode.com/articles/longest-common-prefix/
 * @author sunayan
 *
 */
public class LongestCommonPrefix {

//	/**
//	 * Naive Method
//	 * @param strs
//	 * @return
//	 */
//	public String longestCommonPrefix(String[] strs) {
//		int i = 0;
//		String result = "";
//		
//		String st = strs[0];
//		String[] subArray = Arrays.copyOfRange(strs, 1, strs.length); // slice and store a subarray
//		int minLen = st.length()-1;
//
//		for (String s : strs) {
//			if (s.length() < st.length())
//				minLen = s.length()-1;
//		}
//		
//		if (strs.length == 1) {
//			return strs[0];
//		}
//		
//
//		while (i <= minLen && minLen >=0) {
//			boolean ifMatchFound = true;
//			for (String str : subArray) {
//				if(str.length() == 0 || str.isEmpty()) {
//					return "";
//				}
//				if (str.charAt(i) != st.charAt(i)) {
//					ifMatchFound = false;
//				}
//			}
//
//			if (ifMatchFound) {
//				result = result + st.charAt(i);
//			} else
//				break;
//			i++;
//		}
//		return result;
//	}

	public String longestCommonPrefix(String[] array) {
		if(array == null) {
			throw new NullPointerException("Array is null");
		}
		
		if(array.length == 0) {
			return "";
		}
		return longestCommonPrefixHelper(array, findMinLen(array));
	}
	
	public String findMinLen(String[] array) {
		String min = array[0];
		for(String arr : array) {
			if(arr.length() < min.length()) {
				min = arr;
			}
		}
		return min;
	}
	
	public String longestCommonPrefixHelper(String[] array, String min) {
		for(int i=0; i<array.length; i++) {
			// if the array element doesnt start with the min prefix, remove(use substr) 
			// the last letter of min to check for rem. match
			if(!array[i].startsWith(min)) {
				//recursive call for checking on the modified min string after removing last char
				return longestCommonPrefixHelper(array, min.substring(0, min.length()-1));
			}
		}
		return min;
	}
	
	public static void main(String[] args) {
//		String[] str = { "aaa", "aa", "aaa"};
//		String[] str = {};
		
		String[] str = {"caa","","a","acb"};
//		["abbb","a","accc","aa"]

		LongestCommonPrefix prefix = new LongestCommonPrefix();
		System.out.println(prefix.longestCommonPrefix(str));
	}

}
