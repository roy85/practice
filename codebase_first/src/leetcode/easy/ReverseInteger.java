package leetcode.easy;

public class ReverseInteger {

	public static void main(String[] args) {

	}

	//57.08% - https://discuss.leetcode.com/topic/15134/very-short-7-lines-and-elegant-solution/13
	public int reverse(int x) {
        long result = 0;
        int digit = 0;

        while (x != 0) {
            digit = x % 10;
            result = (result * 10 + digit);
            x /= 10;
        }

        if(result > Integer.MAX_VALUE || result < Integer.MIN_VALUE){
            return 0;
        }

        return (int)result;
    }
}
