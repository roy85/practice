package leetcode.easy;

public class BalancedBinaryTree {

	public static void main(String[] args) {
//		TreeNode root = new TreeNode(50);
//		root.left=new TreeNode(25);
//		root.right=new TreeNode(75);
//		root.left.left=new TreeNode(15);
//		root.left.right=new TreeNode(35);
//		root.right.left=new TreeNode(65);
//		root.right.right=new TreeNode(85);
//		root.right.right.left=new TreeNode(80);		 
//		root.right.right.right=new TreeNode(95);
//		root.right.right.right.left=new TreeNode(90);
//		System.out.println(isBalanced(root));
		
//		TreeNode root = new TreeNode(50);		
//		System.out.println(isBalanced(root));
		
		TreeNode root = new TreeNode(50);
		root.left=new TreeNode(25);
		root.right=new TreeNode(75);
		root.left.left=new TreeNode(15);
		root.left.right=new TreeNode(35);
		System.out.println(isBalanced(root));
	}
	
	public static boolean isBalanced(TreeNode root){
		return dfs(root)!=-1;
	}

	private static int dfs(TreeNode root) {
		if(root==null)
			return 0;
		
		int left = dfs(root.left);
		if(left==-1)
			return -1;
		int right = dfs(root.right);
		if(right==0-1)
			return -1;
		
		if(Math.abs(left-right)>1)
			return -1;
						
		return (1+Math.max(left, right));
	}

}
