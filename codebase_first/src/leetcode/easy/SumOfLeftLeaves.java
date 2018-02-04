package leetcode.easy;

import java.util.Stack;

public class SumOfLeftLeaves {

	public static void main(String[] args) {
//		TreeNode root = new TreeNode(3);
//		root.left=new TreeNode(9);
//		root.right=new TreeNode(20);
//		root.right.left=new TreeNode(15);
//		root.right.right=new TreeNode(7);
		
//		TreeNode root = new TreeNode(3);
		
//		TreeNode root = new TreeNode(3);
//		root.left=new TreeNode(9);
		
//		TreeNode root = new TreeNode(3);
//		root.right=new TreeNode(9);
		
		TreeNode root = new TreeNode(1);
		root.left=new TreeNode(2);
		root.right=new TreeNode(3);
		root.left.left=new TreeNode(4);
		root.left.right=new TreeNode(5);
		
		
		System.out.println(sumOfLeftLeaves(root));
	}

	//20.42%
	public static int sumOfLeftLeaves(TreeNode root) {
		if(root==null) return 0;
		
		int sum=0;
		
		Stack<TreeNode> stack = new Stack<>();
		stack.push(root);
		
		while(!stack.isEmpty()){
			TreeNode current = stack.pop();
			if(current.left!=null){
				if(current.left.left ==null && current.left.right == null){
					sum+=current.left.val;
				}
				stack.push(current.left);
			}
			if(current.right!=null){
				stack.push(current.right);
			}
		}
		
		return sum;
	}
}
