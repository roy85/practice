package leetcode.easy;

public class SumOfSquareNumbers {

	public static void main(String[] args) {
//		System.out.println(judgeSquareSum(25));
//		System.out.println(judgeSquareSum(26));
//		System.out.println(judgeSquareSum(34));
//		System.out.println(judgeSquareSum(35));
//		System.out.println(judgeSquareSum(4));
		System.out.println(judgeSquareSum(1000));
	}

	//93.49% - copied
	public static boolean judgeSquareSum(int c) {
		if (c < 0) {
            return false;
        }
        int left = 0, right = (int)Math.sqrt(c);
        while (left <= right) {
            int cur = left * left + right * right;
            if (cur < c) {
                left++;
            } else if (cur > c) {
                right--;
            } else {
                return true;
            }
        }
        return false;
	}
	
	//43.24% -copied
//	public static boolean judgeSquareSum(int c) {
//		for (int i=0;i<=Math.sqrt(c);i++) 
//		    if (Math.floor(Math.sqrt(c-i*i)) == Math.sqrt(c-i*i)) return true;
//		  return false;
//	}
}
