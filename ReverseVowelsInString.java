package leetcode.questions.practice;

import java.util.ArrayList;

public class ReverseVowelsInString {

	public String reverseVowels(String s) {
		ArrayList<Character> vowList = new ArrayList<Character>();
		vowList.add('a');
		vowList.add('e');
		vowList.add('i');
		vowList.add('o');
		vowList.add('u');
		vowList.add('A');
		vowList.add('E');
		vowList.add('I');
		vowList.add('O');
		vowList.add('U');

		char[] arr = s.toCharArray();
		int j = s.length() - 1;
		int i = 0;

		while (i < j) {
			if (!vowList.contains(arr[i])) {
				i++;
				continue;
			}

			if (!vowList.contains(arr[j])) {
				j--;
				continue;
			}

			char t = arr[i];
			arr[i] = arr[j];
			arr[j] = t;
			
			i++;
			j--;
		}
		return new String(arr);
	}

	public static void main(String[] args) {
		ReverseVowelsInString revVowels = new ReverseVowelsInString();
		String result = revVowels.reverseVowels("leetcode");
		System.out.println(result);
	}
}
