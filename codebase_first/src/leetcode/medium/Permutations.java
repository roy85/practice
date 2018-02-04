package leetcode.medium;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutations {

	public static void main(String[] args) {
		int[] nums = {1,2,3};
		
		List<List<Integer>> resultList = permute(nums);
		if(resultList==null || resultList.size()==0)
			System.out.println("Result is empty!");
		else{
			System.out.println("Result=");
			for(List<Integer> l1 : resultList){
//				for(int x : l1){
//					
//				}
				
				System.out.println(l1.toString());
			}
		}
		
//		Permutations p = new Permutations();
//		List<List<Integer>> list = p.permute(nums, 0, nums.length-1);
	}

	private static List<List<Integer>> list = new ArrayList<>();
	
	public static List<List<Integer>> permute(int[] nums){
		list.clear();
		
		Permutations p = new Permutations();
		p.permute(nums, 0, nums.length-1);
		
		return list;
	}
	
	private void permute(int[] nums, int l, int r)
    {
        if (l == r)
        	addArrayToList(nums);
        else
        {
            for (int i = l; i <= r; i++)
            {
                nums = swap(nums,l,i);
                permute(nums, l+1, r);
                nums = swap(nums,l,i);
            }
        }
    }
	
	private void addArrayToList(int[] nums) {
		List<Integer> tempList = new ArrayList<>();
		for(int x : nums)
			tempList.add(x);
		list.add(tempList);
	}

	private int[] swap(int[] a, int i, int j)
    {
        int temp;
        temp = a[i] ;
        a[i] = a[j];
        a[j] = temp;
        return a;
    }
}
