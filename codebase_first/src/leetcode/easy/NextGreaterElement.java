package leetcode.easy;
/*
 * Not very efficient. 19ms. 15.61%
 */
public class NextGreaterElement {

	public static void main(String[] args) {
//		int[] arr = Solution43.nextGreaterElement(new int[]{2,4}, new int[]{1,2,3,4});
		int[] arr = Solution43.nextGreaterElement(new int[]{4,1,2}, new int[]{1,3,4,2});
		for(int n : arr){
			System.out.println(n);
		}
	}

}

class Solution43{
	public static int[] nextGreaterElement(int[] findNums, int[] nums) {
		
		int[] ret = new int[findNums.length];
		int key=-1;
		int keyLoc=-1;
		
		for(int i=0;i<ret.length;i++){
			ret[i]=-1;
		}
		
		if(findNums!=null && nums!=null){
			for(int i=0;i<findNums.length;i++){
				
				key = findNums[i];
				keyLoc=-1;
				for(int j=0;j<nums.length;j++){
					if(nums[j] == key){
						keyLoc=j;
					}
					if(keyLoc!=-1 && nums[j]>key){
						ret[i]= nums[j];
						break;
					}
					
				}
			}
		}
		
		return ret;
	}
}