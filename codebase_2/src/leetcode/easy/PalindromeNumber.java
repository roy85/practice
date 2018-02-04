package leetcode.easy;

public class PalindromeNumber {

	public static void main(String[] args) {
		System.out.println(isPalindrome(12321));
		System.out.println(isPalindrome(1232));
	}

	public static boolean isPalindrome(int x) {
		boolean is = false;		
		boolean isNegative = x>=0?false:true;
		int rem = 0;
		x = Math.abs(x);
		String s = Integer.toString(x);
		int i=0;
//		if(s.length()%2==0)
		{
			while(x>rem)
			{
				rem = rem*10+x%10;
				x = x/10;
			}
			
			if(x==rem || x==rem/10)
				is=true;
			
//			if(rem == x)
//				return true;
		}
		
		
		return is;
	}
}
