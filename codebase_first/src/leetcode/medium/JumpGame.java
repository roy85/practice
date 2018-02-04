package leetcode.medium;

public class JumpGame {

	public static void main(String[] args) {
		System.out.println(canJump(new int[]{2,3,1,1,4}));
		System.out.println(canJump(new int[]{3,2,1,0,4}));
	}

	public static boolean canJump(int[] nums){
		int n = nums.length;
		int remLength = n-1;
		for(int i=1;i<n;){
			int temp = nums[i];
			if(temp!=0){
			if(temp==remLength-1){
				return true;
			}
			i+=temp;
			remLength-=temp;
			}
			else i++;
		}
		return false;
	}
}
