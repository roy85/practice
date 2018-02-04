package leetcode;

public class LargestPalindromeProject {

	public static void main(String[] args) {
		Solution18 sol = new Solution18();
		long start = System.nanoTime();
		System.out.println(sol.largestPalindrome(2));
		long end = System.nanoTime();
		System.out.println("diff = " + (end-start));
		System.out.println(sol.largestPalindrome(3));
	}

}

class Solution18{
	public int largestPalindrome(int n) {
		
		int product = 0;
		
		int max = (int)(Math.pow(10, n)-1);
		int min = (int)(Math.pow(10, n-1)-1);
		
		for(int i=max;i>min;i--){
			for(int j=max;j>min;j--){
				if(isPalindrome(i*j)){
					product = i*j;
					break;
				}
			}
			if(product>0){
				break;
			}
		}
		
		return product ;//% 1337;
    }

	private boolean isPalindrome(int i) {
		StringBuilder sb = new StringBuilder(Integer.toString(i));
				
		return sb.toString().equals(sb.reverse().toString());
	} 
}