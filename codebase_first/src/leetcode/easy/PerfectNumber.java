package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class PerfectNumber {

	public static void main(String[] args) {
		System.out.println(Solution42.checkPerfectNumber(28));
		System.out.println(Solution42.checkPerfectNumber(99999996));
		System.out.println(Solution42.checkPerfectNumber(0));
		System.out.println(Solution42.checkPerfectNumber(1));
		System.out.println(Solution42.checkPerfectNumber(-1));
	}

}

class Solution42{

	//81.83% 13ms
	public static boolean checkPerfectNumber(int num) {
		 if (num < 2) return false;
         int sum = 1;
         for (int x = 2; x * x <= num; x++)
         {
             if (num % x == 0)
             {
                 sum += x;
                 sum += num / x;
             }
         }
         
         return sum == num;
     }
		
//        int sum=1;
//        int limit=num;
//        
//        List<Integer>
//        
//        if(num==0||num==1){
//        	return false;
//        }
//        
//        for(int i=2;i<num;i++){
//        	
//        	while(num%i==0){
//        		num=num/i;
//        		sum+=limit;
//        		sum+=i;		
//        	}
//        }
//        
//        return (sum == num);
    

	
	//877ms 5.xx%
//	public static boolean checkPerfectNumber(int num) {
//        int sum=1;
//        int limit=num;
//        
//        if(num==0||num==1){
//        	return false;
//        }
//        
//        for(int i=2;i<limit;i++){
//        	
//        	if(num%i==0){
//        		limit=num/i;
//        		sum+=limit;
//        		sum+=i;		
//        	}
//        }
//        
//        return (sum == num);
//    }

	
	
	//	public static boolean checkPerfectNumber(int num) {
//        int sum=0;
//        int limit=num;
//        List<Integer> list = new ArrayList<>();
//        list.add(1);
//        
//        for(int i=2;i<limit;i++){
//        	
//        	if(num%i==0 && !list.contains(i)){
//        		limit=num/i;
//        		list.add(limit);
//        		list.add(i);		
//        	}
//        }
//
//        for(int n : list){
//        	sum+=n;
//        }
//        
//        return (sum == num);
//    }
	
//	public static boolean checkPerfectNumber(int num) {
//        int sum=1;
//        for(int i=2;i<=num/2;i++){
//        	if(num%i==0){        		
//        		sum+=i;
//        	}
//        }
//        
//        return (sum == num);
//    }
}