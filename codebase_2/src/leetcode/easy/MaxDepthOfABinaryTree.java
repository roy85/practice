package leetcode.easy;

public class MaxDepthOfABinaryTree {

	public static void main(String[] args) {

	}

	public static int maxDepth(TreeNode root) {
		
		if(root!=null){
			return getHeight(root);
		}
		else
		{
			throw new IllegalArgumentException();
		}
	}
	
	private static int getHeight(TreeNode root){
		if(root==null)
			return 0;
		return Math.max(getHeight(root.left), getHeight(root.right))+1;
	}
}

class TreeNode{
	
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode(int x){
		val = x;
	}
}