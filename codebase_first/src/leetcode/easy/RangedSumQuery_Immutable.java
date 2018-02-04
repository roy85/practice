package leetcode.easy;

public class RangedSumQuery_Immutable {

	public static void main(String[] args) {
		NumArray obj = new NumArray(new int[] {-2, 0, 3, -5, 2, -1});
		
		System.out.println(obj.sumRange(0,2));
		System.out.println(obj.sumRange(2,5));
		System.out.println(obj.sumRange(0,5));
	}

	
}

class NumArray {

	int[] store;
	int[] nums2;
	
    public NumArray(int[] nums) {
    	nums2 = nums;
        if(nums.length>0){
        	store = new int[nums.length];
            store[0] = nums[0];
            for(int i=1;i<store.length;i++){
            	store[i] = nums[i] + store[i-1];
            }
        }
    }
    
    public int sumRange(int i, int j) {
        if(store.length>0 && j>=i && j<store.length){
        	if(i>0 && i!=j)
        		return (store[j]-store[i-1]);
        	else if(i==j)
        		return nums2[i];
        	else if(i==0)
        		return store[j];
        }
        
        return -1;
    }
}