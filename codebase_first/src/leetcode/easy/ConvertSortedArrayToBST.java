package leetcode.easy;



public class ConvertSortedArrayToBST {

	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5,6,7,8,9,10};
		TreeNode result = sortedArrayToBST(nums);
		
		if(result==null)
			System.out.println("result is null");
		
		DFSPrint.printBSTBFS(result);
	}

	public static TreeNode sortedArrayToBST(int[] nums){
		if(nums==null || nums.length==0)
			return null;
		return buildTree(nums, 0, nums.length-1);
	}

	private static TreeNode buildTree(int[] nums, int l, int r) {
		int mid = (l+r)/2;
		TreeNode root = new TreeNode(nums[mid]);
		
		if(mid>l)
			root.left = buildTree(nums, l,mid-1);
		
		if(r>mid)
			root.right = buildTree(nums, mid+1, r);
		
		return root;
	}
}
