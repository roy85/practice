package leetcode.medium;

/*
 * Implement pow(x, n).
 */
public class Pow_x_n {

	public static void main(String[] args) {
//		System.out.println(myPow(7, 3));
//		System.out.println(myPow(7, 0));
//		System.out.println(myPow(7, 1));
//		System.out.println(myPow(7, -1));
		System.out.println(myPow(34.00515, -3));
		System.out.println(myPow(2.00000, -2147483648));
		
	}
	
	//51.15% - https://discuss.leetcode.com/topic/21837/5-different-choices-when-talk-with-interviewers
	double myPow(double x, int n) { 
		if(n<0) return 1/x * myPow(1/x, -(n+1));
	    if(n==0) return 1;
	    if(n==2) return x*x;
	    if(n%2==0) return myPow( myPow(x, n/2), 2);
	    else return x*myPow( myPow(x, n/2), 2);
	}
	
	//29.25% - https://discuss.leetcode.com/topic/40546/iterative-log-n-solution-with-clear-explanation
//	public double myPow(double x, int n) {
//        double ans = 1;
//        long absN = Math.abs((long)n);
//        while(absN > 0) {
//            if((absN&1)==1) ans *= x;
//            absN >>= 1;
//            x *= x;
//        }
//        return n < 0 ?  1/ans : ans;
//    }

	//67.73% - https://discuss.leetcode.com/topic/5425/short-and-easy-to-understand-solution
//	public static double myPow(double x, int n) {
//		
//		if(n == 0)
//            return 1;
//        if(n<0){
//        	if( n == Integer.MIN_VALUE)
//        	{
//	        	++n;
//	        	n = -n;
//	        	x = 1/x;
//	        	return x * x * myPow( x*x, n/2 );
//        	}
//            n = -n;
//            x = 1/x;
//        }
//        return (n%2 == 0) ? myPow(x*x, n/2) : x*myPow(x*x, n/2);
//	}
}
