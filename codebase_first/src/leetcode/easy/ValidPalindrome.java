package leetcode.easy;

public class ValidPalindrome {

	public static void main(String[] args) {
		System.out.println(isPalindrome("ama"));
		System.out.println(isPalindrome("ama "));
		System.out.println(isPalindrome("A,ama a"));
		System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
		System.out.println(isPalindrome("race a car"));
	}

	//71.02% - https://discuss.leetcode.com/topic/8282/accepted-pretty-java-solution-271ms
	public static boolean isPalindrome(String s) {
        if (s.isEmpty()) {
        	return true;
        }
        int head = 0, tail = s.length() - 1;
        char cHead, cTail;
        while(head <= tail) {
        	cHead = s.charAt(head);
        	cTail = s.charAt(tail);
        	if (!Character.isLetterOrDigit(cHead)) {
        		head++;
        	} else if(!Character.isLetterOrDigit(cTail)) {
        		tail--;
        	} else {
        		if (Character.toLowerCase(cHead) != Character.toLowerCase(cTail)) {
        			return false;
        		}
        		head++;
        		tail--;
        	}
        }
        
        return true;
    }
	
//	public static boolean isPalindrome(String s) {
//		
//		int low=0;
//		int high = s.length()-1;
//		
//		while(low<high){
//			if(!isAlphabet(s.charAt(low)))
//				low++;
//			if(!isAlphabet(s.charAt(high)))
//				high--;
//			if(isAlphabet(s.charAt(low)) && isAlphabet(s.charAt(high))){
//				if(Character.toLowerCase(s.charAt(low))!=Character.toLowerCase(s.charAt(high))) return false;
//				low++;
//				high--;
//			}
//		}
//		
//		return true;
//	}
//
//	private static boolean isAlphabet(char c) {
//		if((c>='A' && c<='Z') || (c>='a' && c<='z')) return true;
//		return false;
//	}
}
