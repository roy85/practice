package leetcode.easy;

import java.util.Arrays;

public class TwoSum2 {

	public static void main(String[] args) {
		int[] arr = {2,7,11,15};
		int[] result = twoSum(arr, 18);
		System.out.println(Arrays.toString(result));
	}

	public static int[] twoSum(int[] numbers, int target) {
		int j=numbers.length-1;
		while(numbers[j]>target)
			j--;
		
		for(int i=0;i<j;){
			if(numbers[i]+numbers[j]==target)
				return new int[]{i,j};
			else if(numbers[i]+numbers[j]<target)
				i++;
			else
				j--;
		}
		
		return null;
	}
}
