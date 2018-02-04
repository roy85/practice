package leetcode.easy;

import java.util.Arrays;

/*
 * Improve
 */
public class ConstructRectangle {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(constructRectangle(4)));
		System.out.println(Arrays.toString(constructRectangle(5)));
		System.out.println(Arrays.toString(constructRectangle(0)));
		System.out.println(Arrays.toString(constructRectangle(10)));
		System.out.println(Arrays.toString(constructRectangle(623)));
		System.out.println(Arrays.toString(constructRectangle(6230)));
		System.out.println(Arrays.toString(constructRectangle(1423534)));
		System.out.println(Arrays.toString(constructRectangle(10000000)));
		System.out.println(Arrays.toString(constructRectangle(1)));
	}

	//3.45%
	public static int[] constructRectangle(int area) {
				
		int L=0;
		int W=0;
		int diff = Integer.MAX_VALUE;
		
		for(int i=1;i<=area;i++){
			
			if(area%i ==0){
				if(Math.abs(i-(area/i)) < diff){
					if(i> (area/i)){
						L = i;
						W = area/i;
					}
					else{
						W = i;
						L = area/i;
					}
					diff = L-W;
				}				
			}
		}
		
		return new int[]{L,W};
	}
}
