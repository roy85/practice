package leetcode;

public class SumInteger {

}

class Solution {
    public int[] twoSum(int[] nums, int target) {
        for(int ptr1=0; ptr1<nums.length; ptr1++){
            for(int ptr2=ptr1+1 ; ptr2<nums.length; ptr2++){
                if(nums[ptr1] + nums[ptr2] == target){
                    return new int[] {ptr1, ptr2};
                }
            }
        }
        return null;
    }
}
