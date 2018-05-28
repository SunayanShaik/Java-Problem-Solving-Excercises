package leetcode.questions.practice;
import java.util.Arrays;

public class TwoSums {

	public int[] twoSum(int[] nums, int target) {
		int[] result = new int[2];
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length;) {
				if (nums[i] != nums[j] && (nums[i] + nums[j]) == target) {
					return new int[]{i,j};
				}
				return result;
			}
		}
		return new int[2];
	}

	public static void main(String[] args) {
		int[] nums = { 2, 7, 11, 15 };
		int target = 9;

		TwoSums testNums = new TwoSums();
		
		int[] output = testNums.twoSum(nums, target);
		System.out.println(Arrays.toString(output));
	}

}
