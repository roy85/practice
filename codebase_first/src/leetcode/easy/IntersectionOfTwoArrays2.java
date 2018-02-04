package leetcode.easy;

import java.util.Arrays;

public class IntersectionOfTwoArrays2 {

	public static void main(String[] args) {
//		int[] result = intersect(new int[]{1,2,2,1}, new int[] {2,2});
//		int[] result = intersect(new int[]{7,1,5,2,3,6}, new int[] {3,8,6,20,7});
		int[] result = intersect(new int[]{3,1,2}, new int[] {1,3});
//		int[] result = intersect(new int[]{1}, new int[] {1,1});
		if(result == null)
			System.out.println("result is null");
		
		System.out.println(Arrays.toString(result));
	}

	public static boolean[] truthArray;
	
	public static int[] intersect(int[] nums1, int[] nums2){
		if(nums1==null || nums2== null){
			return null;
		}
		
		if(nums1.length==0)
            return nums1;
        if(nums2.length==0)
            return nums2;
		
		int[] arrA, arrB;
				
		if(nums1.length>nums2.length){
			arrA = nums1;
			arrB = nums2;
		}
		else{
			arrA = nums2;
			arrB = nums1;
		}
		
		int[] result = new int[arrB.length];
		boolean[] truthTable = new boolean[arrB.length]; 
		Arrays.sort(arrB);
		int l=0, r=arrB.length-1,j=0;
		
		for(int i=0;i<arrA.length;i++){
			int mid = (l+r)/2;
			int num = arrA[i];
			int x=-1;
			while(true){
				if(arrB[l]==num && !truthTable[l]){
					x=l;
				}
				else if(arrB[r]==num && !truthTable[r]){
					x=r;
				}
				else if(r-l==1)
					break;
				else if(arrB[mid]==num && !truthTable[mid]){
					x=mid;
				}
				else if(num>arrB[mid]){
					if(mid==r)
						break;
					l=mid+1;
					continue;
				}
				else{
					if(mid==l)
						break;
					r=mid-1;
					continue;
				}
				
				if(x>-1){
					result[j++] = num;
					truthTable[l] = true;
					break;
				}
			}
		}
		
		return Arrays.copyOf(result, j);
	}
	
//	public static int[] intersect(int[] nums1, int[] nums2){
//		if(nums1==null || nums2== null){
//			return null;
//		}
//		
//		if(nums1.length==0)
//            return nums1;
//        if(nums2.length==0)
//            return nums2;
//		
//		int[] arrA, arrB;
//				
//		if(nums1.length>nums2.length){
//			arrA = nums1;
//			arrB = nums2;
//		}
//		else{
//			arrA = nums2;
//			arrB = nums1;
//		}
//		int[] result = new int[arrB.length];
//				
//		Arrays.sort(arrB);
//		truthArray = new boolean[arrB.length];
//		
//		int j=0;
//		for(int i=0;i<arrA.length;i++){
//			if(doBinarySearch(arrB, arrA[i], 0, arrB.length-1)){
//				result[j++] = arrA[i];
//			}
//		}
//				
//		return Arrays.copyOf(result, j);
//	}
//
//	private static boolean doBinarySearch(int[] arr, int number, int left, int right) {
//		if(left<0 || right>= arr.length)
//			return false;
//		
//		int mid = (left+right)/2;
//		
//		if(number<arr[left] || number>arr[right])
//			return false;		
//		else if(number == arr[left] && !truthArray[left])
//		{
//			truthArray[left] = true;
//			return true;
//		}
//		else if(number == arr[right] && !truthArray[right])
//		{
//			truthArray[right] = true;
//			return true;
//		}
//		else if(number > arr[mid])
//			return doBinarySearch(arr, number, mid+1, right);
//		else
//			return doBinarySearch(arr, number, left, mid-1);
//		
//	}
}
