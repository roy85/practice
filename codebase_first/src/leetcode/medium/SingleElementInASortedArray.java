package leetcode.medium;

/*
 * O(logn) solutions:
 * https://discuss.leetcode.com/topic/83310/short-compare-nums-i-with-nums-i-1/2
 * https://discuss.leetcode.com/topic/82332/java-binary-search-o-log-n-shorter-than-others
 * https://discuss.leetcode.com/topic/87424/java-binary-search-short-7l-o-log-n-w-explanations
 */
public class SingleElementInASortedArray {

	public static void main(String[] args) {
		System.out.println(singleNonDuplicate(new int[] {1,1,2,2,3,3,4,4,5,5,6,6}));
	}

	public static int singleNonDuplicate(int[] nums){
		int x=nums[0];
		for(int i=1;i<nums.length;i++){
			x^=nums[i];
		}
		
		return x;
	}
}
