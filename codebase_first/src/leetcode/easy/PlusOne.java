package leetcode.easy;

import java.util.Arrays;

public class PlusOne {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(plusOne(new int[] {9,9,9,9})));
	}

	public static int[] plusOne(int[] digits){
		int x=1, y=0;
		for(int i=digits.length-1;i>=0 && x>0; i--){
			y=digits[i];
			x=x+y;
			digits[i] = x%10;
			x = x/10;
		}
		
		if(x>0)
		{
			int[] arr = new int[digits.length+1];
			arr[0] = x;
			for(int i=1;i<digits.length;i++){
				arr[i] = digits[i];
			}
			digits = arr;
		}
		
		return digits;
	}
}
