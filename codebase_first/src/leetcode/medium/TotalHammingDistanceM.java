package leetcode.medium;

public class TotalHammingDistanceM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

class Solution25{
	public int totalHammingDistance(int[] nums) {
		int totalDistance = 0;
		int[] binLength = new int[nums.length];
		
		for(int i=0;i<nums.length;i++){
			binLength[i] = Integer.toBinaryString(nums[i]).length();
		}
		
//		for(int i=0;i<)
		
		return totalDistance;
    }
}