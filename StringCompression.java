package leetcode.questions.practice;

public class StringCompression {

	public int compress(char[] chars) {
		int count = 1, index = 0;

		if(chars.length == 0 || chars == null) {
			return 0;
		}
		
		if (chars.length == 1) {
			return 1;
		}

		char c = chars[0];
		for (int i = 1; i <= chars.length - 1; i++) {
			if (chars[i] == c) {
				++count;
			} else {
				chars[index++] = c;
				if (count != 1) {
					for(char cr : Integer.toString(count).toCharArray())  {
						chars[index++] = cr;
					}		
				}
				c =  chars[i];
				count = 1;
			}
		}
		
		chars[index++] = c;
		if(count != 1) {
			for(char cr : Integer.toString(count).toCharArray())  {
				chars[index++] = cr;
			}
		}
		return index;
	}

	// public int compress(char[] chars) {
	// int anchor = 0, indexLen = 0;
	// for (int i = 0; i < chars.length; i++) {
	// if (i + 1 == chars.length || chars[i + 1] != chars[i]) {
	// chars[indexLen++] = chars[anchor];
	// if (i > anchor) {
	// for (char c: ("" + (i - anchor + 1)).toCharArray()) {
	// chars[indexLen++] = c;
	// }
	// }
	// anchor = i + 1;
	// }
	// }
	// return indexLen;
	// }

	public static void main(String[] args) {
		StringCompression str = new StringCompression();
		System.out.println(str.compress(new char[] { 'a', 'b', 'b', 'b', 'b','b', 'b', 'b', 'b', 'b', 'b', 'b', 'b' }));
	}

}
