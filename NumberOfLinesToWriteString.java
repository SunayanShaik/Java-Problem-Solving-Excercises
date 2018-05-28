package leetcode.questions.practice;

public class NumberOfLinesToWriteString {

	public int[] numberOfLines(int[] widths, String S) {
		int lineWidth = 0;
		int line = 1; // Minimum lines is 1
		for (char c : S.toCharArray()) {
			
			int newWidth = widths[c - 'a']; // Finding width of character from the array, eg. for char "d" will be at position 4 so "d"- "a" will give ys 4 and we can see the width
			lineWidth += newWidth;
			if (lineWidth > 100) {
				line++;
				lineWidth = newWidth; // last line characters
			}
		}
		return new int[] { line, lineWidth };
	}

	public static void main(String[] args) {
		NumberOfLinesToWriteString lines = new NumberOfLinesToWriteString();
		int[] result = lines.numberOfLines(new int[]{10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10}, "abcdefghijklmnopqrstuvwxyz");
		System.out.println("[" + result[0] + ", " + result[1] + "]");
	}

}
