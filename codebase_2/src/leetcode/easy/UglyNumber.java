package leetcode.easy;

import java.util.HashSet;
import java.util.Set;

public class UglyNumber {

	public static void main(String[] args) {
		System.out.println(getPrimeFactors(30));
	}
	
	public static boolean isUgly(int num){
		
	}

	public static Set<Integer> getPrimeFactors(int num){
		Set<Integer> set = new HashSet<>();
		int x=num;
		for(int i=2;i<num/2;){
			while(x%i==0){
				set.add(i);
				x=x/i;
			}
			i++;
		}
		
		return set;
	}
}
