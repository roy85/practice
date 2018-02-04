package leetcode.easy;

public class MaximumSubArray {

	public static void main(String[] args) {

		System.out.println(maxSubArray(new int[] {-2,1,-3,4,-1,2,1,-5,4}));
		
	}
	
	/*
	 * maxSubArray(nums, i) = (maxSubArray(nums, i-1)>0? maxSubArray(nums, i-1) : 0)+A[i] 
	 */

	//76.09% - https://discuss.leetcode.com/topic/6413/dp-solution-some-thoughts
	/*
	 * For every element i, finding Sum(i) is found by calculating Max of Sum(i-1)+A[i] & 0+A[i] in case Sum(i-1)<0
	 * At any given i, the answer is provided by calculating the current max and the sum after including current element. 
	 */
	/*
	 * Solution1 (c++):
	 * Here is the sub-problem we state: denote int_local_max[i] as the max-sub-array-sum that ends with nums[i]. 
	 * The relationship between the two steps is simple: 
	 * int_local_max[i + 1] = max (int_local_max[i] + nums[i + 1], nums[i + 1]) or 
	 * int_local_max[i + 1] = (int_local_max[i] > 0) ? int_local_max[i] + nums[i + 1] : nums[i + 1].

		Now, all we have to do is to scan through the array, 
		and find which int_local_max[i] is the maximum of all the int_local_maxs.

	 * int maxSubArray(vector<int>& nums) {
        if (nums.size() == 0) return 0;
        else if (nums.size() == 1) return nums.at(0);
        
        int int_local_max = nums.at(0), int_global_max = nums.at(0);
        size_t sz_length  = nums.size();
        for (size_t i = 1; i != sz_length; ++i) {
            int_local_max  = max(int_local_max + nums.at(i), nums.at(i));
            int_global_max = max(int_local_max, int_global_max);
        }
        
        return int_global_max;
    }
    
    Solution2:
    public int maxSubArray(int[] A) {
        int n = A.length;
        int[] dp = new int[n];//dp[i] means the maximum subarray ending with A[i];
        dp[0] = A[0];
        int max = dp[0];
        
        for(int i = 1; i < n; i++){
            dp[i] = A[i] + (dp[i - 1] > 0 ? dp[i - 1] : 0);
            max = Math.max(max, dp[i]);
        }
        
        return max;
}
	 */
	
	public static int maxSubArray(int[] nums) {
		int sum = nums[0];
		int max = nums[0];
		
		for(int i=1;i<nums.length;i++){
			sum = Math.max(nums[i], sum+nums[i]);
			max = Math.max(max, sum);
		}
		
		return max;
	}
}
