package leetcode.medium;

public class ContainsDuplicate3 {

	public static void main(String[] args) {
		System.out.println(containsNearbyAlmostDuplicate(new int[]{1,2,3,4,5,6,7},2,3));
	}

	public static boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t){
		for(int i=0;i+k<nums.length;i++){
			if(Math.abs(nums[i]-nums[i+k])==t)
				return true;
		}
		return false;
	}
}
