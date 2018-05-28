package leetcode.questions.practice;

import java.util.HashMap;

public class RansomNote {

	public boolean canConstruct(String ransomNote, String magazine) {
		boolean canConstructFlag = true;
		HashMap<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < magazine.length(); i++) {
			Character currMagChar = magazine.charAt(i);
			if (!map.containsKey(currMagChar)) {
				map.put(currMagChar, 1);
			} else {
				Integer count = map.get(currMagChar);
				map.put(currMagChar, ++count);
			}
		}

		for (int j = 0; j < ransomNote.length(); j++) {
			Character currentRansomChar = ransomNote.charAt(j);
			Integer count = map.get(currentRansomChar);
			if (count == null || count == 0) {
				canConstructFlag = false;
			} else
				map.put(currentRansomChar, --count);
		}
		return canConstructFlag;
	}

	public static void main(String[] args) {
		RansomNote note = new RansomNote();
		boolean result = note.canConstruct("fffbfg", "effjfggbffjdgbjjhhdegh");
		System.out.println(result);
	}

}
