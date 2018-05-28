package leetcode.questions.practice;

public class ReverseIntegerApproach2 {
	public static int reverse(int x) {
		int resultNum = 0, prev_result_num = 0;
		while (x != 0) {
			resultNum = x % 10 + resultNum * 10;
			if((resultNum)/10 != prev_result_num) {
				return 0;
			}
			prev_result_num = resultNum;
			x = x / 10;
		}
		return resultNum;
	}

	public static void main(String[] args) {
		System.out.println(reverse(1534236469));
	}

}
