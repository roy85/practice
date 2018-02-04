package leetcode;

import java.util.Arrays;

public class SumInteger_SortedArray {

	public static void main(String[] args) {
		Solution2 sol = new Solution2();
		
		int[] arr1 = {2,7,11,15};
		System.out.println(Arrays.toString(sol.twoSum(arr1, 9)));
		System.out.println(Arrays.toString(sol.twoSum(arr1, 18)));
//		System.out.println(Arrays.toString(sol.twoSum(arr1, 24)));
		

	}

}

class Solution3 {
    public int[] twoSum(int[] numbers, int target) {
    	        
        throw new IllegalArgumentException("No Two Sum solution");
    }
}



class Solution2 {
    public int[] twoSum(int[] numbers, int target) {
    	int lptr=0; int rptr=numbers.length-1;
        for(lptr=0; lptr<rptr ; lptr++){
        	for(rptr=numbers.length-1; rptr> lptr; rptr--){
        		if(numbers[lptr] + numbers[rptr] > target){
        			continue;
        		}
        		else if(numbers[lptr] + numbers[rptr] < target){
        			break;
        		}
        		else
        		{
        			return new int[]{++lptr, ++rptr};
        		}
        	}
        }
        
        throw new IllegalArgumentException("No Two Sum solution");
    }
}


