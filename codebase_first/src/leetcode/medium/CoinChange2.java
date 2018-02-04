package leetcode.medium;

import java.util.Arrays;

public class CoinChange2 {

	public static void main(String[] args) {
//		System.out.println(change(13,new int[] {7,2,3,6}));
//		System.out.println(change(11,new int[] {1,2,5}));
		System.out.println(change(5,new int[] {1,2,5}));
	}

	private static int[] dp;

	public static int change(int amount, int[] coins) {
	    dp = new int[amount + 1];
	    Arrays.fill(dp, -1);
	    dp[0] = 1;
	    return helper(coins, amount);
	}

	private static int helper(int[] nums, int target) {
	    if (dp[target] != -1) {
	        return dp[target];
	    }
	    int res = 0;
	    for (int i = 0; i < nums.length; i++) {
	        if (target >= nums[i]) {
	            res += helper(nums, target - nums[i]);
	        }
	    }
	    dp[target] = res;
	    return res;
	}
	
}
