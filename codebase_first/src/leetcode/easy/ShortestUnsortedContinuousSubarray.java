package leetcode.easy;

import java.util.Arrays;

public class ShortestUnsortedContinuousSubarray {

	public static void main(String[] args) {
//		System.out.println(findUnsortedSubarray(new int[] {2, 6, 4, 8, 10, 9, 15}));
//		System.out.println(findUnsortedSubarray(new int[] {2, 6, 4, 25, 30, 9, 15}));
//		System.out.println(findUnsortedSubarray(new int[] {1,2,3,4,5}));
//		System.out.println(findUnsortedSubarray(new int[] {}));
//		System.out.println(findUnsortedSubarray(new int[] {1,2}));
//		System.out.println(findUnsortedSubarray(new int[] {2,1}));
//		System.out.println(findUnsortedSubarray(new int[] {2,1,3}));
//		System.out.println(findUnsortedSubarray(new int[] {3,2,1}));
//		System.out.println(findUnsortedSubarray(new int[] {1,1,3,2,2,4}));
//		System.out.println(findUnsortedSubarray(new int[] {2, 6, 4, 8, 10,10,8, 9, 15}));
//		System.out.println(findUnsortedSubarray(new int[] {1,3,2,4,5}));
	}

	//60.60% - https://discuss.leetcode.com/topic/89282/java-o-n-time-o-1-space
	/*
	 * I use the variables beg and end to keep track of minimum subarray A[beg...end] which must be sorted 
	 * for the entire array A to be sorted. If end < beg < 0 at the end of the for loop, then the array is 
	 * already fully sorted.
	 */
	public int findUnsortedSubarray(int[] nums) {
        int len=nums.length;
        int max=Integer.MIN_VALUE, min=Integer.MAX_VALUE;
        int start=-1, end=-1;
        
        for(int i=0; i<len; i++){
            max = Math.max(max, nums[i]); //from left to right, search the current max
            min = Math.min(min, nums[len-i-1]);  //from right to left, search the current min 
            
            if(nums[i] < max)  
                end = i;
            if(nums[len-i-1] > min)
                start = len-i-1;
        }
        
        if(start==-1) //the entire array is already sorted
            return 0;
        
        return end-start+1;
    }
	
	//60.60% - https://leetcode.com/problems/shortest-unsorted-continuous-subarray/#/solution
	/*
	 * Approach #5 Without Using Extra Space [Accepted]:

Algorithm

The idea behind this method is that the correct position of the minimum element in the unsorted subarray helps 
to determine the required left boundary. Similarly, the correct position of the maximum element in the unsorted 
subarray helps to determine the required right boundary.

Thus, firstly we need to determine when the correctly sorted array goes wrong. We keep a track of this by observing 
rising slope starting from the beginning of the array. Whenever the slope falls, we know that the unsorted array 
has surely started. Thus, now we determine the minimum element found till the end of the array numsnums, given 
by minmin.

Similarly, we scan the array numsnums in the reverse order and when the slope becomes rising instead of falling, 
we start looking for the maximum element till we reach the beginning of the array, given by maxmax.

Then, we traverse over numsnums and determine the correct position of minmin and maxmax by comparing these elements 
with the other array elements. e.g. To determine the correct position of minmin, we know the initial portion of 
numsnums is already sorted. Thus, we need to find the first element which is just larger than minmin. 
Similarly, for maxmax's position, we need to find the first element which is just smaller than maxmax 
searching in numsnums backwards.
	 */
//	public int findUnsortedSubarray(int[] nums) {
//        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
//        boolean flag = false;
//        for (int i = 1; i < nums.length; i++) {
//            if (nums[i] < nums[i - 1])
//                flag = true;
//            if (flag)
//                min = Math.min(min, nums[i]);
//        }
//        flag = false;
//        for (int i = nums.length - 2; i >= 0; i--) {
//            if (nums[i] > nums[i + 1])
//                flag = true;
//            if (flag)
//                max = Math.max(max, nums[i]);
//        }
//        int l, r;
//        for (l = 0; l < nums.length; l++) {
//            if (min < nums[l])
//                break;
//        }
//        for (r = nums.length - 1; r >= 0; r--) {
//            if (max > nums[r])
//                break;
//        }
//        return r - l < 0 ? 0 : r - l + 1;
//    }
	
	//26.31% - https://leetcode.com/problems/shortest-unsorted-continuous-subarray/#/solution
	/*
	 * Approach #3 Using Sorting [Accepted]
	 * Another very simple idea is as follows. We can sort a copy of the given array numsnums, 
	 * say given by nums\_sortednums_sorted. Then, if we compare the elements of numsnums and 
	 * nums\_sortednums_sorted, we can determine the leftmost and rightmost elements which mismatch. 
	 * The subarray lying between them is, then, the required shorted unsorted subarray.
	 */
//	public int findUnsortedSubarray(int[] nums) {
//        int[] snums = nums.clone();
//        Arrays.sort(snums);
//        int start = snums.length, end = 0;
//        for (int i = 0; i < snums.length; i++) {
//            if (snums[i] != nums[i]) {
//                start = Math.min(start, i);
//                end = Math.max(end, i);
//            }
//        }
//        return (end - start >= 0 ? end - start + 1 : 0);
//    }
	
//	public static int findUnsortedSubarray(int[] nums) {
//		
//		if(nums==null || nums.length==0)
//			return 0;
//		
//		int left=0, right=nums.length-1, start=-1,end=-1;
//		
//		while(left<right){
//			if(nums[right]<nums[left]){
//				start=left;
//				end=right;
//			}
//			else{
//				if(left+1<right){
//					if(nums[left+1]>nums[left])
//					{
//						left++;
////						start++;
//					}
//					if(nums[right-1]<nums[right])
//					{
//						right--;
////						end--;
//					}					
//				}
//				else{
//					break;
//				}
//			}
//		}
//		
//		return end-start;
//	}
	
//	public static int findUnsortedSubarray(int[] nums) {
//		int length=0;
//		boolean isThere = false;
//		int max=-1;
//		int maxLoc=-1;
//		
//		for(int i=0;i<nums.length;i++){
//			if(i<nums.length-1 && nums[i]>nums[i+1] && !isThere){
//				isThere = true;
//				length++;
//			}
//			else if(isThere){
//				length++;
//			}
//			if(nums[i]>max){
//				max = nums[i];
//				maxLoc = i;
//			}
//		}
//		
//		if(isThere){
//			for(int i=nums.length-1;i>=0;i--){
//				if(nums[i]>nums[i-1] && i<=maxLoc){
//					length--;
//				}
//				else{
//					break;
//				}
//			}
//		}
//		
//		return length;
//	}
	
//	public static int findUnsortedSubarray(int[] nums) {
//		int length=0;
//		boolean isThere = false;
//		
//		for(int i=0;i<nums.length;i++){
//			if(i<nums.length-1 && nums[i]>nums[i+1] && !isThere){
//				isThere = true;
//				length++;
//			}
//			else if(isThere){
//				length++;
//			}
//		}
//		
//		if(isThere){
//			for(int i=nums.length-1;i>=0;i--){
//				if(nums[i]>nums[i-1]){
//					length--;
//				}
//				else{
//					break;
//				}
//			}
//		}
//		
//		
//		return length;
//	}
}
