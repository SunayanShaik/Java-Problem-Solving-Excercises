package leetcode.questions.practice;

import java.util.HashMap;

public class JewelsAndStones {

	public int numJewelsInStones(String J, String S) {
        HashMap<Character, Integer> map = new HashMap<>();
        Integer numJInS = 0;
        
        for(int i=0; i<J.length(); i++) {
        	Character currentJewel = J.charAt(i);
        	
        	if(!map.containsKey(currentJewel)) {
        		map.put(currentJewel, 1);
        	} else {
        		Integer count = map.get(currentJewel);
        		map.put(currentJewel, ++count);
        	}
        }
        
        for(int j=0; j<S.length(); j++) {
        	Character currStone = S.charAt(j);
        	
        	if(!map.containsKey(currStone)) {
        		continue;
        	} else {
        		++numJInS;
        	}
        }
        
        return numJInS;
        
    }

	public static void main(String[] args) {
		JewelsAndStones jewelsAnsStones = new JewelsAndStones();
		int count = jewelsAnsStones.numJewelsInStones("aA", "aAAbbbb");
		System.out.println(count);
	}

}
