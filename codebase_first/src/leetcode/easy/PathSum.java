package leetcode.easy;

public class PathSum {

	public static void main(String[] args) {
		
//		TreeNode n = new TreeNode(-2);
////		n.left = new TreeNode(4);
//		n.right=new TreeNode(-3);
//		
//		System.out.println(hasPathSum(n, -5));
		
		
//		TreeNode n = new TreeNode(5);
//		n.left = new TreeNode(4);
//		n.right=new TreeNode(8);
//		
//		n.left.left=new TreeNode(11);
//		
//		n.right.left=new TreeNode(13);
//		n.right.right=new TreeNode(4);
//				
//		n.left.left.left=new TreeNode(7);
//		n.left.left.right=new TreeNode(2);
//		
//		n.right.right.right=new TreeNode(1);
//		
//		System.out.println(hasPathSum(n, 22));
//		System.out.println(hasPathSum(n, 26));
//		System.out.println(hasPathSum(n, 18));
//		System.out.println(hasPathSum(n, 19));
//		System.out.println(hasPathSum(n, 13));

		TreeNode n = new TreeNode(1);
		
		n.left = new TreeNode(-2);
		n.right=new TreeNode(-3);
		
		n.left.left=new TreeNode(1);
		n.left.right=new TreeNode(3);
		
		n.right.left=new TreeNode(-2);
						
		n.left.left.left=new TreeNode(-1);
						
		System.out.println(hasPathSum(n, -1));
		

		
	}

	public static boolean hasPathSum(TreeNode root, int sum) {
		
		if(root==null) return false;
		
		if(root.left==null && root.right==null)
		{
			if(root.val==sum)
				return true;
			else
				return false;
		}
			sum=sum-root.val;
			return hasPathSum(root.left, sum) || hasPathSum(root.right, sum);

		
		
	}

	
//	public static boolean hasPathSum(TreeNode root, int sum) {
//				
//		if(root==null) return false;
//		if(root.val==sum && root.left==null && root.right==null)
//			return true;
//		if(root.val==sum && (root.left!=null || root.right!=null))
//			return false;
//		
//		if(sum>0){			
//			sum=sum-root.val;
//			if(root.left!=null){
//				if(sum == root.left.val)
//					return true;
//				else if(sum>root.val)
//					return hasPathSum(root.left, sum);
//			}
//			if(root.right!=null){
//				if(sum == root.right.val)
//					return true;
//				else if(sum>root.right.val)
//					return hasPathSum(root.right, sum);
//			}
//		}
//		
//		return false;
//	}
}
