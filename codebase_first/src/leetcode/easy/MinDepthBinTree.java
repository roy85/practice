package leetcode.easy;

/*
 * Repeat on own
 */
public class MinDepthBinTree {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
//		root.left = new TreeNode(2);
//		
//		System.out.println(minDepth(root));
		
		root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(5);
		root.left.left=new TreeNode(3);
		root.right.right = new TreeNode(6);
		root.left.left.left=new TreeNode(4);
		root.left.left.left.left=new TreeNode(8);
		
		System.out.println(minDepth(root));
		
	}

	public static int minDepth(TreeNode root) {
		if(root == null) return 0;
	     if(root.left ==null) return 1+minDepth(root.right);
	     if(root.right ==null) return 1+minDepth(root.left);
	     return 1+Math.min(minDepth(root.left),minDepth(root.right));		
		
		
//        if(root==null){
//			return 0;
//		}			
////		System.out.println("left="+root.left.val);
//		int leftDepth = minDepth(root.left);
//		
////		System.out.println("right="+root.right.val);
//		int rightDepth = minDepth(root.right);
//		
//		int min = Math.max(leftDepth, rightDepth);
//		
//		return ++min;
    }
}
