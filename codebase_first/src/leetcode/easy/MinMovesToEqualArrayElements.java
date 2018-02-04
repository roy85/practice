package leetcode.easy;

public class MinMovesToEqualArrayElements {

	public static void main(String[] args) {
		System.out.println(minMoves(new int[] {1,2,3}));
		System.out.println(minMoves(new int[] {1,2}));
		System.out.println(minMoves(new int[] {1,1,1,1,1}));
		System.out.println(minMoves(new int[] {1,1,1,0,1}));
	}

	public static int minMoves(int[] nums){
		if(nums==null || nums.length==0 || nums.length==1)
			return 0;
		
		return getMinMoves(nums, 0);
	}

	private static int maxIndex=-1;
	
	private static int getMinMoves(int[] nums, int moves) {
		maxIndex=-1;
		if(isAllSame(nums))
		{
			return moves;
		}
		
		incrementAllButMaxIndex(nums);
		
		return getMinMoves(nums,++moves);
	}

	private static boolean isAllSame(int[] nums) {
		boolean isSame=true;
		int pivot=nums[0];
		maxIndex = 0;
		
		for(int i=0;i<nums.length;i++){
			if(nums[i]==pivot){
				continue;
			}
			else{
				isSame=false;
				if(pivot<nums[i]){
					maxIndex = i;
					pivot = nums[i];
				}
			}
		}
				
		return isSame;
	}

	private static void incrementAllButMaxIndex(int[] nums) {
		for(int i=0;i<nums.length;i++){
			if(i!=maxIndex)
				nums[i]++;
		}
	}
}
