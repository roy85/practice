package leetcode;

public class CheckPalindromeNumber {

	public static void main(String[] args) {
		Solution19 sol = new Solution19();
		System.out.println(sol.palindromeNumber(99));
		System.out.println(sol.palindromeNumber(91));
		System.out.println(sol.palindromeNumber(990099));
	}

}

class Solution19{
	public boolean palindromeNumber(int n){
		boolean isPalindrome = false;
		
		StringBuilder sb = new StringBuilder(Integer.toString(n));
		
		if(sb.toString().equals(sb.reverse().toString())){
			isPalindrome = true;
		}
		
		return isPalindrome;
	}
}