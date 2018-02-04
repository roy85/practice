package leetcode.easy;

/*
 * Repeat on own
 */
public class MaxDepthBinTree {

	public static void main(String[] args) {

	}

	public static int maxDepth(TreeNode root) {
		
		if(root==null){
			return 0;
		}			
		
		int leftDepth = maxDepth(root.left);
		int rightDepth = maxDepth(root.right);
		
		int max = Math.max(leftDepth, rightDepth);
		
		return ++max;
	}
}

