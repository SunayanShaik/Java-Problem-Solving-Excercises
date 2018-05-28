package leetcode.questions.practice;

public class ReverseInteger {
	
	public static int reverse(int x) {
		int resultNum = 0, prev_result_num = 0;
		if (checkResultNum(resultNum)) {
			int temp = 0;
			while (x != 0) {
				temp = x % 10;
				// if x = x*10 + y; then check whether (x-y)/10 == x
				if((resultNum - temp)/10 != prev_result_num) {
					return 0;
				}
				prev_result_num = resultNum;
				resultNum = temp + resultNum * 10;
				x = x / 10;
			}
			return resultNum;
		}
		return 0;

	}
	
	public static boolean checkResultNum(int resultNum) {
		boolean numInRange = false;
		if(resultNum >= (Math.pow(-2, 31)) && resultNum <= (Math.pow(2, 31) - 1)) {
			numInRange = true;
		}
		return numInRange;
	}

	public static void main(String[] args) {
		System.out.println(reverse(1534236469));
	}

}
