package leetcode.easy;

public class LargestPalindromeProduct {

	public static void main(String[] args) {
		System.out.println(largestPalindrome(2));
		System.out.println(largestPalindrome(1));
		System.out.println(largestPalindrome(8));
		System.out.println(largestPalindrome(3));
	}

	private static int largestPalindrome(int n){
		
		int max = (int)Math.pow(10, n)-1;
		int min = max/10;
		
		for(int i= max;i>=min;i--){
			for(int j= max;j>=min;j--){
				if(isPalindrome(i*j)){
					return (i*j) % 1337;
				}
			}
		}
		return -1;
	}
	
	private static boolean isPalindrome(int num){
		StringBuilder sb = new StringBuilder(Integer.toString(num));
		return sb.toString().equals(sb.reverse().toString());
	}
}
