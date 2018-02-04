package leetcode.easy;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

	public static void main(String[] args) {
//		System.out.println(isHappy(19));
		System.out.println(isHappy(18));
//		System.out.println(isHappy(1));
	}

	public static boolean isHappy(int n) {
		Set<Integer> set = new HashSet<>();
		while(n!=1 && !set.contains(n)){
			set.add(n);
			int rem=0;
			while(n>0){
				rem += Math.pow(n%10, 2);
				n=n/10;
			}
			n=rem;			
		}
		if(n==1)
			return true;
		else
			return false;
	}
}
