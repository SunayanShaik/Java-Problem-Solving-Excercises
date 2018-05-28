package leetcode.questions.practice;

public class ReverseStringII {
	/**
	 * Given a string and an integer k, you need to reverse the first k
	 * characters for every 2k characters counting from the start of the string.
	 * If there are less than k characters left, reverse all of them. If there
	 * are less than 2k but greater than or equal to k characters, then reverse
	 * the first k characters and left the other as original.
	 * 
	 * @param s
	 * @param k
	 * @return
	 */
	// public String reverseStr(String s, int k) {
	// if (s == null || s.isEmpty()) {
	// return s;
	// }
	// StringBuilder sb = new StringBuilder();
	// boolean reverse = true;
	// for (int i = 0; i < s.length(); i = i + k, reverse = false) {
	// int end = (i + k) < s.length() ? (i + k - 1) : s.length() - 1;
	// if (reverse)
	// for (int j = end; j >= i; j--) {
	// sb.append(s.charAt(j));
	// } // Copy in reverse
	// else
	// for (int j = i; j <= end; j++) {
	// sb.append(s.charAt(j));
	// } // Copy as it is
	// }
	// return sb.toString();
	// }

	public String reverseStr(String s, int k) {
		StringBuilder sb = new StringBuilder();

		int i = 0, j = 0;
		while (i < s.length()) {
			// first k
			j = i + k <= s.length() ? i + k : s.length();
			sb.append((new StringBuilder(s.substring(i, j))).reverse().toString());

			if (j >= s.length())
				break;

			// second k
			i = j;
			j = i + k <= s.length() ? i + k : s.length();
			sb.append(s.substring(i, j));

			i = j;
		}

		return sb.toString();
	}
	
//	string reverseStr( string s, int k) {
//        for ( int i = 0 ; i < s.size(); i += 2 * k) {
//           Reverse(s.begin() + i, min(s.begin() + i + k, s.end()));
//       }
//       Return s;

	public static void main(String[] args) {
		ReverseStringII revStr = new ReverseStringII();
		System.out.println(revStr.reverseStr("abcdefg", 2));
	}

}
