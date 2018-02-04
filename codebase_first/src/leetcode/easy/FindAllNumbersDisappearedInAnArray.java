package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/*
 * Improve
 */
public class FindAllNumbersDisappearedInAnArray {

	public static void main(String[] args) {
		List<Integer> list = findDisappearedNumbers(new int[] {1,1,2});
//		List<Integer> list = findDisappearedNumbers(new int[] {4,3,2,7,8,2,3,1});
		for(int i=0;i<list.size();i++){
			System.out.println(list.get(i));
		}
		
		
	}

	//41.19% - copied https://discuss.leetcode.com/topic/66211/2ms-o-n-in-space-java
	public static List<Integer> findDisappearedNumbers(int[] nums) {		
		
		List<Integer> result = new ArrayList<Integer>();
        for( int i=0;i< nums.length; i++){
            int index = nums[i];
            if(nums[Math.abs(index)-1] > 0){
                nums[Math.abs(index)-1]= -nums[Math.abs(index)-1];
            }
        }
        
        for(int j =1 ;j <= nums.length ; j++){
            if(nums[j-1] > 0){
                result.add(j);
            }
        }
        return result;
	}
	
	//0.56%
//	public static List<Integer> findDisappearedNumbers(int[] nums) {		
//				
//		Map<Integer, Integer> map = new HashMap<>();
//		for(int i=1;i<=nums.length;i++){
//			map.put(i,i);
//		}		
//		
//		for(int i=0;i<nums.length;i++){
//			if(map.containsKey(nums[i])){
//				map.remove(nums[i]);
//			}
//		}		
//		
//		return new ArrayList<>(map.values());
//	}
}
