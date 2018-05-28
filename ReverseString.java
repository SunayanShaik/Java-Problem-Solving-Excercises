package leetcode.questions.practice;

public class ReverseString {

	public static String reverseString(String s) {
		StringBuilder result = new StringBuilder();
        if((s == null) || s.length()==0) {
            return s.toString();
        }
        for(int i=s.length()-1; i>=0; i--) {
        	result.append(s.charAt(i));
        }
		return result.toString();
    }

	public static void main(String[] args) {
		System.out.println(reverseString("hello as hraf ashu ashu ashu ashu"));
	}

}
