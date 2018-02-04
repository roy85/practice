package leetcode.medium;

public class SearchInRotatedSortedArray {

	public static void main(String[] args) {
		System.out.println(search(new int[]{4,5,6,7,0,1,2}, 1));
		System.out.println(search(new int[]{}, 1));
		System.out.println(search(new int[]{4,5,6,7,0,1,2}, 3));
		System.out.println(search(new int[]{4,5,6,7,1,2}, 0));
	}

	public static int search(int[] nums, int target) {
		if(nums==null || nums.length==0) return -1;
	    int minIdx = findMinIdx(nums);
	    if (target == nums[minIdx]) return minIdx;
	    int m = nums.length;
	    int start = (target <= nums[m - 1]) ? minIdx : 0;
	    int end = (target > nums[m - 1]) ? minIdx : m - 1;
	    
	    while (start <= end) {
	        int mid = start + (end - start) / 2;
	        if (nums[mid] == target) return mid;
	        else if (target > nums[mid]) start = mid + 1;
	        else end = mid - 1;
	    }
	    return -1;
	}

	public static int findMinIdx(int[] nums) {
	    int start = 0, end = nums.length - 1;
	    while (start < end) {
	        int mid = start + (end -  start) / 2;
	        if (nums[mid] > nums[end]) start = mid + 1;
	        else end = mid;
	    }
		return start;
	}

	
//	//36.xx%
//	public static int search(int[] nums, int target) {
//		
//		boolean isStart = false;
//		for(int i=0;i<nums.length;i++){
//			if(i>0 && !isStart && nums[i]<nums[0]){
//				isStart=true;//found the start of array
//			}
//			
//			if(target == nums[i])
//				return i;
//			else if(target>nums[i])
//				continue;
//			else if(isStart)
//				return -1;
//		}
//		
//		return -1;
//	}
}
