package leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class MaximumProductSubarray {

	public static void main(String[] args) {

	}

	public static int maxProduct(int[] nums) {
        if(nums.length==1)
        	return nums[0];
        
        int negs = 0;
        List<Integer> prods = new ArrayList<Integer>();
        int prod=1;
        for(int i=0;i<nums.length;i++){
        	if(nums[i]<0)
        	{
        		negs++;
        		if(i>0){
        			prods.add(prod);
        			prod=1;
        		}
        	}
        	else{
        		prod*=nums[i];
        	}        	
        }
        
        if(negs==0 || negs%2==0){
        	prod=1;
        	for(int i=0;i<nums.length;i++){
        		prod*=nums.length;
        	}
        }
        else{
        	
        }
		
		return prod;
    }
}
