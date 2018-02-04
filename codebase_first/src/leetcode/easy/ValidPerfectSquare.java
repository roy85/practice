package leetcode.easy;

import java.util.HashMap;
import java.util.Map;

public class ValidPerfectSquare {

	public static void main(String[] args) {
		System.out.println(isPerfectSquare(25));
		System.out.println(isPerfectSquare(625));
		System.out.println(isPerfectSquare(251));
	}

	//40.24%-copied
	public static boolean isPerfectSquare(int num) {
		long x = num;
        while (x * x > num) {
            x = (x + num / x) >> 1;
        }
        return x * x == num;
	}
	
	//https://discuss.leetcode.com/topic/49325/a-square-number-is-1-3-5-7-java-code
	//40.24%-copied
//	public static boolean isPerfectSquare(int num) {
//		int low = 1, high = num;
//        while (low <= high) {
//            long mid = (low + high) >>> 1;
//            if (mid * mid == num) {
//                return true;
//            } else if (mid * mid < num) {
//                low = (int) mid + 1;
//            } else {
//                high = (int) mid - 1;
//            }
//        }
//        return false;
//	}
	
	//20.71% - copied
//	public static boolean isPerfectSquare(int num) {
//		int i = 1;
//	     while (num > 0) {
//	         num -= i;
//	         i += 2;
//	     }
//	     return num == 0;
//	}
	
//	TLE for 2147483647 
//	public static boolean isPerfectSquare(int num) {
//		boolean isPerfectSq = false;
//		
//		if(num==1)
//			return true;
//		
//		int n = 2;
//		Map<Integer, Integer> map = new HashMap<>();
//		while(num>1){
//			if(num%n!=0){
//				n++;
//			}
//			else{
//				num = num/n;
//				if(!map.containsKey(n)){
//					map.put(n, 1);
//				}
//				else{
//					map.put(n, map.get(n)+1);
//				}
//			}
//		}
//		
//		for(Map.Entry<Integer, Integer> entry : map.entrySet()){
//			if(entry.getValue()%2==0){
//				isPerfectSq=true;
//			}
//			else{
//				isPerfectSq=false;
//			}
//		}
//		
//		return isPerfectSq;
//	}
}
