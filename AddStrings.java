package leetcode.questions.practice;

public class AddStrings {

	public String addStrings(String num1, String num2) {

		StringBuilder sb = new StringBuilder();
		int carry = 0;
		int diff = 0;

		// appending 0 at front of the number to match the lengths of both
		// numbers.
		if (num1.length() < num2.length()) {
			diff = num2.length() - num1.length();
			for (int j = 0; j < diff; j++) {
				num1 = "0" + num1;
			}
		} else {
			diff = num1.length() - num2.length();
			for (int j = 0; j < diff; j++) {
				num2 = "0" + num2;
			}
		}

		char[] n1 = num1.toCharArray();
		char[] n2 = num2.toCharArray();
		int sum = 0;

		for (int i = n1.length - 1; i >= 0; i--) {
			int x = n1[i] - '0'; // to get int value of char use subtraction
			int y = n2[i] - '0';
			sum = x + y + carry;
			if (sum >= 10) {
				carry = sum / 10;
				sum = sum % 10;
			} else {
				carry = 0;

			}
			sb.insert(0, sum);
		}

		if(carry!=0) {
			sb.insert(0, carry);
		}
		
		return sb.toString();
	}

	public static void main(String[] args) {
		AddStrings addStr = new AddStrings();
		System.out.println(addStr.addStrings("1251", "125"));
	}

}
