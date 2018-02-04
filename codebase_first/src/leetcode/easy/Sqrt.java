package leetcode.easy;

public class Sqrt {

	public static void main(String[] args) {
		
	}
	
	//18.94% - copied
	public int sqrt(int x) {
	    if (x == 0)
	        return 0;
	    int left = 1, right = Integer.MAX_VALUE;
	    while (true) {
	        int mid = left + (right - left)/2;
	        if (mid > x/mid) {
	            right = mid - 1;
	        } else {
	            if (mid + 1 > x/(mid + 1))
	                return mid;
	            left = mid + 1;
	        }
	    }
	}
	
	//72.27% - https://discuss.leetcode.com/topic/24532/3-4-short-lines-integer-newton-every-language
//	public static int mySqrt(int x) {
//		long r = x;
//	    while (r*r > x)
//	        r = (r + x/r) / 2;
//	    return (int) r;
//	}

}
