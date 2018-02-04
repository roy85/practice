package others;

/*
 * Geeksforgeeks: http://www.geeksforgeeks.org/maximum-sum-such-that-no-two-elements-are-adjacent/
 */
public class MaxSumInArray_NoAdjacentNumbers {

	public static void main(String[] args) {
		System.out.println(getMaxSum(new int[] {1,5, 5, 10, 100, 10, 5}));
	}
	
	public static int getMaxSum(int[] arr){
		int max = Integer.MIN_VALUE;
		
		if(arr.length==0) throw new IllegalArgumentException("Error");
		if(arr.length==1) return arr[0];
		if(arr.length==2) return Math.max(arr[0],arr[1]);
		
		int odd=0,even=0;
		
		for(int i=0;i<arr.length;i++){
			if(i==0 || i%2==0)
				even+=arr[i];
			else
				odd+=arr[i];
		}
		
		max = Math.max(even,  odd);
		
		return max;
	}

}
