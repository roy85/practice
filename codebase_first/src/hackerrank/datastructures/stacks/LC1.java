package hackerrank.datastructures.stacks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class LC1 {

	public static void main(String[] args) {
		System.out.println(maximumProduct(new int[] {26,2,3,4}));
		System.out.println(maximumProduct(new int[] {-4,-3,-2,-1,60}));
	}

	public static int maximumProduct(int[] nums) {
        if(nums==null || nums.length==0)
        	return 0;
		int product = 0;
        if(nums.length<=3)
        {
        	for(int i=0;i<nums.length;i++)
        		product *= nums[i];
        	return product;
        }
                
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;
                
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        
        int temp1=0;
        int temp2=0;
        for(int i=0;i<nums.length;i++){
        	if(nums[i]>first){
        		temp1 = second;
        		temp2 = first;
        		first = nums[i];
        		second = temp2;
        		third = temp1;
        	}
        	else if(nums[i]>second)
        	{
        		temp1 = second;
        		second = nums[i];
        		third = temp1;        		
        	}
        	else if(nums[i]>third)
        	{
        		third = nums[i];
        	}
        	
        	if(min1>nums[i])
        	{
        		temp1 = min1;
        		min1 = nums[i];
        		min2 = temp1;
        	}
        	else if(min2> nums[i]){
        		min2 = nums[i];
        	}
        }
        
        product = first*second*third;
        int negProduct = first*min1*min2;
        return Math.max(product, negProduct);
    }
}
