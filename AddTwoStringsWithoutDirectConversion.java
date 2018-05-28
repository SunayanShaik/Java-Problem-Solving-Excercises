package leetcode.questions.practice;

public class AddTwoStringsWithoutDirectConversion {

	public static String multiply(String num1, String num2) {
		
		char[] n1 = num1.toCharArray();
        char[] n2 = num2.toCharArray();

        int i = n1.length - 1;
        int j = n2.length - 1;

        StringBuilder sumString = new StringBuilder();
        int carry = 0;

        while(i >= 0 || j >= 0){
            int d1 = 0;
            int d2 = 0;

            if (i >= 0) d1 = n1[i--] - '0';
            if (j >= 0) d2 = n2[j--] - '0';

            int sum = d1 + d2 + carry;
            if (sum >= 10){
                carry = sum / 10;
                sum = sum % 10;
            }else carry = 0;

            sumString.insert(0, sum);
        }
        return sumString.toString();
	}
	
//	public String addStrings(String num1, String num2) {
//	    int i = num1.length() - 1, j = num2.length() - 1, carry = 0;
//	    String res = "";
//	    while (i >= 0 || j >= 0) {
//	        if (i >= 0)
//	            carry += num1.charAt(i--) - '0';
//	        if (j >= 0)
//	            carry += num2.charAt(j--) - '0';
//	        res = Integer.toString(carry % 10) + res;
//	        carry /= 10;
//	    }
//	    return carry != 0 ? "1" + res : res;
//	}
	
//    public String addStrings(String num1, String num2) {
//        StringBuilder sb = new StringBuilder();
//        int carry = 0;
//        for(int i = num1.length() - 1, j = num2.length() - 1; i >= 0 || j >= 0; i--, j--){
//            int x = i < 0 ? 0 : num1.charAt(i) - '0';
//            int y = j < 0 ? 0 : num2.charAt(j) - '0';
//            sb.append((x + y + carry) % 10);
//            carry = (x + y + carry) / 10;
//        }
//        if(carry != 0)
//            sb.append(carry);
//        return sb.reverse().toString();
//    }
	
//	public class Solution {
//	    public String addStrings(String num1, String num2) {
//	        int i = num1.length() - 1;
//	        int j = num2.length() - 1;
//	        StringBuilder builder = new StringBuilder();
//	        int carry = 0;
//	        while (i >= 0 || j >= 0) {
//	            if (i >= 0) {
//	                carry += num1.charAt(i) - '0';
//	            }
//	            if (j >= 0) {
//	                carry += num2.charAt(j) - '0';
//	            }
//	            builder.append((char)(carry % 10 + '0'));
//	            carry /= 10;
//	            i--;
//	            j--;
//	        }
//	        if (carry == 1) {
//	            builder.append('1');
//	        }
//	        return builder.reverse().toString();
//	    }
//	}

	public static void main(String[] args) {
		System.out.println(multiply("2", "3"));
	}

}
