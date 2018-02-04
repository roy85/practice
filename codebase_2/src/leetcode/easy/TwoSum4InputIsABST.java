package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class TwoSum4InputIsABST {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(5);
		root.left = new TreeNode(3);
		root.right = new TreeNode(6);
		root.left.left = new TreeNode(2);
		root.left.right=new TreeNode(4);
		root.right.right=new TreeNode(7);
		
		System.out.println(findTarget(root, 1));
	}

	public static boolean findTarget(TreeNode root, int k) {
		if(root == null)
			return false;
		if(root.val>k)
			return findTarget(root.left, k);
		
		int max = getMaxElement(root);
		int remainder = k-max;
		if(remainder>max)
			return false;
		
		list = new ArrayList<>();
		return isTwoSumInTree(root, k);
	}

	private static List<Integer> list;
	
	private static boolean isTwoSumInTree(TreeNode root, int k) {
		if(root==null)
			return false;
		
		if(list.contains(k-root.val))
			return true;
			
		list.add(root.val);
				
		return isTwoSumInTree(root.left, k) || isTwoSumInTree(root.right, k);
	}

	private static int getMaxElement(TreeNode root) {
		if(root==null)
			return 0;
		if(root.right == null)
			return root.val;
		return getMaxElement(root.right);
	}
}
