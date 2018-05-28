package leetcode.questions.practice;

public class PalindromeNumber {

	public static boolean isPalindrome(int x) {
		int result = 0, temp = x;
		while (temp > 0 && temp != 0) {
			result = result * 10 + temp % 10;
			temp = temp / 10;
		}
		if (result == x) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		System.out.println(isPalindrome(121));
	}

}
