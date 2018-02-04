package leetcode.easy;

public class LowestCommonAncestorOfBinarySearchTree {

	public static void main(String[] args) {

		TreeNode root = new TreeNode(50);
		root.left=new TreeNode(25);
		root.right=new TreeNode(75);
		root.left.left=new TreeNode(15);
		root.left.right=new TreeNode(35);
		root.right.left=new TreeNode(65);
		root.right.right=new TreeNode(85);
		root.right.right.left=new TreeNode(80);		 
		root.right.right.right=new TreeNode(95);
		root.right.right.right.left=new TreeNode(90);
		
		TreeNode p = root.left;
		TreeNode q = root.right;
		
//		TreeNode p = root.right.right.left;
//		TreeNode q = root.right.right.right.left;
		
		TreeNode result = lowestCommonAncestor(root, p, q);
		if(result==null)
			System.out.println("result is null");
		else
			System.out.println("result="+result.val);
	}

	public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q){
		if(root==null || q==null || p==null)
			return null;
		
		if((root.val>=p.val && root.val<=q.val) || (root.val<=p.val && root.val>=q.val))
			return root;
		else if (root.val>=p.val && root.val>=q.val)
			return lowestCommonAncestor(root.left, p, q);
		else if (root.val<=p.val && root.val<=q.val)
			return lowestCommonAncestor(root.right, p, q);
			
		return null;
	}
}
