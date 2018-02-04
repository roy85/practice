package leetcode.easy;

import java.util.HashSet;
import java.util.Set;

/*
 * Repeat.
 */
public class UglyNumber {

	public static void main(String[] args) {
//		for(int i=0;i<=30;i++){
//			System.out.println(i+"="+Solution37.isUgly(i));
//		}
		System.out.println(Solution37.isUgly2(0));
//		System.out.println(Solution37.isUgly2(-6));
//		System.out.println(Solution37.isUgly(8));
//		System.out.println(Solution37.isUgly(14));
//		System.out.println(Solution37.isUgly(30));
//		System.out.println(Solution37.isUgly(42));
//		System.out.println(Solution37.isUgly(600851475));
//		System.out.println(Solution37.isUgly(905391974));
//		System.out.println(Solution37.isUgly(452695987));
		
	}

}

class Solution37{

	//24.98%
	public static boolean isUgly2(int num) {
		if(num>0){
	    while(num%2  == 0)
	        num/=2;

	    while(num%3 == 0)
	        num/=3;

	    while(num%5 == 0)
	        num/=5;
		}
	    return (num==1);
	}
	
	public static boolean isUgly(int num) {
        boolean isUgly=false;
        if(num>0){
        	isUgly=true;
        	
        	if(num==1){
            	return true;
            }
        	
        	Set<Integer> set = new HashSet<>();
	        	        
	        for(int i=2;i<=num;i++){
	        	while(num%i==0){
	        		num=num/i;
	        		set.add(i);
	        	}
	        }
	        
	        if(set.size()>3){
	        	isUgly= false;
	        }
	        else{
	        	for(int n : set){
	        		if(n!=2 && n!=3 && n!=5){
	        			return false;
	        		}
	        	}
	        }
        }
        return isUgly;
    }
    
    
}