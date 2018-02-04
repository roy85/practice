package leetcode.easy;

/*
 * Write an algorithm to determine if a number is "happy".

A happy number is a number defined by the following process: Starting with any positive integer, 
replace the number by the sum of the squares of its digits, and repeat the process until the number 
equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1. 
Those numbers for which this process ends in 1 are happy numbers.

Example: 19 is a happy number

12 + 92 = 82
82 + 22 = 68
62 + 82 = 100
12 + 02 + 02 = 1
 */
public class HappyNumber {

	public static void main(String[] args) {
//		System.out.println(Solution38.isHappy(1246));
//		System.out.println(Solution38.isHappy(0));
//		System.out.println(Solution38.isHappy(1));
//		System.out.println(Solution38.isHappy(2));
//		System.out.println(Solution38.isHappy(19));
//		System.out.println(Solution38.isHappy(7));
	}

}

class Solution38{
	
	
	
	//82.21% - https://discuss.leetcode.com/topic/12742/o-1-space-java-solution
	/*https://discuss.leetcode.com/topic/12587/my-solution-in-c-o-1-space-and-no-magic-math-property-involved
	 * https://discuss.leetcode.com/topic/30520/explanation-of-why-those-posted-algorithms-are-mathematically-valid
	 * https://discuss.leetcode.com/topic/42746/all-you-need-to-know-about-testing-happy-number	 * 
	 */
	public boolean isHappy(int n) {
        int x = n;
        int y = n;
        while(x>1){
            x = cal(x) ;
            if(x==1) return true ;
            y = cal(cal(y));
            if(y==1) return true ;

            if(x==y) return false;
        }
        return true ;
    }
    public int cal(int n){
        int x = n;
        int s = 0;
        while(x>0){
            s = s+(x%10)*(x%10);
            x = x/10;
        }
        return s ;
    }
    

    //Another: https://discuss.leetcode.com/topic/25026/beat-90-fast-easy-understand-java-solution-with-brief-explanation
//    public boolean isHappy(int n) {
//        Set<Integer> inLoop = new HashSet<Integer>();
//        int squareSum,remain;
//    	while (inLoop.add(n)) {
//    		squareSum = 0;
//    		while (n > 0) {
//    		    remain = n%10;
//    			squareSum += remain*remain;
//    			n /= 10;
//    		}
//    		if (squareSum == 1)
//    			return true;
//    		else
//    			n = squareSum;
//
//    	}
//    	return false;
//
//    }
	
//	public static boolean isHappy(int n) {
//        boolean isHappy=false;
//        
//        int sum=n, rem=0;
//        
//        if(n<10){
//        	sum=sum*sum;
//        }
//        
//        while(sum/10>0){
//        	rem=sum;
//        	sum=0;
//        	while(rem>0){
//        		int val = rem%10;
//        		sum += val*val;
//        		rem=rem/10;
//        	}
//        }
//        
//        if(sum==1)
//        	isHappy=true;
//        
//        return isHappy;
//    }
	
//	public static boolean isHappy(int n) {
//        boolean isHappy=false;
//        while(n>1){
//	        int arr[] = new int[Integer.toString(n).length()];
//	        
//	        int x=n;
//	        int y=0;
//	        for(int i=0;i<arr.length;i++){
//	        	y=x%10;
//	        	x=((x-y)/10);
//	        	arr[i]=y;
//	        }
//	        
//	        y=0;
//	        for(int i=0;i<arr.length;i++){
//	        	y+=Math.pow(arr[i], 2);
//	        }
//	        n=y;
//        }
//        
//        if(n==1){
//        	isHappy=true;
//        }
//        return isHappy;
//    }
	
//    public static boolean isHappy(int n) {
//        boolean isHappy=false;
//        while(n>1){
//	        int arr[] = new int[Integer.toString(n).length()];
////	        if(arr.length==1){
////	        	if(n==1){
////	        		return true;
////	        	}
//////	        	else{
//////	        		return false;
//////	        	}
////	        }
//	        
//	        int x=n;
//	        int y=0;
//	        for(int i=0;i<arr.length;i++){
//	        	y=x%10;
//	        	x=((x-y)/10);
//	        	arr[i]=y;
//	        }
//	        
//	        y=0;
//	        for(int i=0;i<arr.length;i++){
//	        	y+=Math.pow(arr[i], 2);
//	        }
//	        n=y;
//        }
//        
//        if(n==1){
//        	isHappy=true;
//        }
//        return isHappy;
//    }
}