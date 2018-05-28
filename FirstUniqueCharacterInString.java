package leetcode.questions.practice;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqueCharacterInString {

	public int firstUniqChar(String s) {
		LinkedHashMap<Character, Integer> hmap = new LinkedHashMap<>();
		
		for (char ch : s.toCharArray()) {
			hmap.put(ch, hmap.containsKey(ch) ? hmap.get(ch)+1 : 1);
		}	
		
		for(Map.Entry<Character, Integer> entry : hmap.entrySet()) {
			if(entry.getValue() == 1) {
				char key = entry.getKey();
				return s.indexOf(key);
			}
		}
		
		return -1;
	}

	public static void main(String[] args) {
		FirstUniqueCharacterInString uniqStr = new FirstUniqueCharacterInString();
		System.out.println(uniqStr.firstUniqChar("leetcode"));
	}

}
