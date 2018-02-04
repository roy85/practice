package leetcode.easy;

import java.util.Arrays;

/*
 * Improve
 */
public class RelativeRanks {

	public static void main(String[] args) {
//		System.out.println(Arrays.toString(findRelativeRanks(new int[] {1,12,3,54,17})));
//		System.out.println(Arrays.toString(findRelativeRanks(new int[] {})));
//		System.out.println(Arrays.toString(findRelativeRanks(new int[] {10999})));
		System.out.println(Arrays.toString(findRelativeRanks(new int[] {10,3,8,9,4})));
	}
	
	//46.52%
	public static String[] findRelativeRanks(int[] nums) {
		if(nums == null || nums.length==0) return null;
		
		String ranks[] = new String[nums.length];
		int n2[] = Arrays.copyOf(nums, nums.length);
		Arrays.sort(n2);
			
		for(int i=0;i<nums.length;i++){
			int j=0;
			for(;j<n2.length;j++){
				if(nums[i]==n2[j]){
					break;
				}
			}
						
			if((nums.length-1-j)==0){
				ranks[i] = "Gold Medal";
			}
			else if(nums.length-1-j==1){
				ranks[i] = "Silver Medal";
			}
			else if(nums.length-1-j==2){
				ranks[i] = "Bronze Medal";
			}
			else{
				ranks[i] = Integer.toString(nums.length-j);
			}
		}
		
		return ranks;
	}

	
//	public static String[] findRelativeRanks(int[] nums) {
//		if(nums == null || nums.length==0) return null;
//		
//		String ranks[] = new String[nums.length];
//		
//		int g=-1,s=-1,b=-1;
//		
//		for(int i=0;i<nums.length;i++){
//			if(g==-1)
//				g=i;
//			else if(s==-1)
//				s=i;
//			else if(b==-1)
//				b=i;
//			for(int j=i+1;j<nums.length;j++){
//				if(nums[j]>nums[g]){
//					if(g==i)
//						g=j;
//					else if (s==i && g!=i)
//						s=j;
//					else if (b==i && g!=i && s!=i)
//						b=j;
//				}
//			}
//		}
//		
//		return ranks;
//	}	
	
//	public static String[] findRelativeRanks(int[] nums) {
//		if(nums == null || nums.length==0) return null;
//		
//		String ranks[] = new String[nums.length];
//		
//		Arrays.sort(nums);
//		for(int i=0;i<nums.length;i++){
//			if(i==0){
//				ranks[i] = "Gold Medal";
//			}
//			else if(i==1){
//				ranks[i] = "Silver Medal";
//			}
//			else if(i==2){
//				ranks[i] = "Bronze Medal";
//			}
//			else{
//				ranks[i] = Integer.toString(nums[i]);
//			}
//		}
//		
//		return ranks;
//	}

}
