package leetcode.easy;

import java.util.Arrays;

/*
 * Improve
 */
public class MergeSortedArray {

	public static void main(String[] args) {
//		int n1[] = new int[7];
//		n1[0]=1;n1[1]=3;n1[2]=5;n1[3]=11;n1[4]=20;
//		merge(n1, 5, new int[]{6,10},2);
		
//		int n1[] = new int[9];
//		n1[0]=1;n1[1]=3;n1[2]=11;n1[3]=20;
//		merge(n1, 4, new int[]{6,10,24,35,63},5);
		
		int n1[] = new int[9];
		n1[0]=1;
		merge(n1, 1, new int[]{0},1);
		
	}

	//5.19%
	public static void merge(int[] nums1, int m, int[] nums2, int n) {
		int i=0,j=0;
		
		while(i<m && j<n){
			if(nums1[i]<nums2[j]){
				i++;
			}
			else{
				for(int k=m-1;k>=i;k--){
					nums1[k+1]=nums1[k];
				}
				nums1[i]=nums2[j];
				i++;
				j++;
				m++;
			}
		}
		
		while(j<n){
			nums1[i]=nums2[j];
			j++;i++;
		}
		
		System.out.println(Arrays.toString(nums1));
	}
}
