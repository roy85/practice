package leetcode.easy;

public class SameTree {

	public static void main(String[] args) {
		System.out.println(isSameTree(null, null));
		System.out.println(isSameTree(null, new TreeNode(1)));
		TreeNode p = new TreeNode(1);
		p.left=new TreeNode(2);
		p.right=new TreeNode(3);
		p.left.left = new TreeNode(4);
		p.left.right=new TreeNode(5);
		p.right.left=new TreeNode(6);
//		p.right.right=new TreeNode(7);
		
		TreeNode q = new TreeNode(1);
		q.left=new TreeNode(2);
		q.right=new TreeNode(3);
		q.left.left = new TreeNode(4);
		q.left.right=new TreeNode(5);
		q.right.left=new TreeNode(6);
//		q.right.right=new TreeNode(7);
		
		System.out.println(isSameTree(p,q));
	}

	public static boolean isSameTree(TreeNode p, TreeNode q){
		if(p==null && q==null)
			return true;
		else if(p==null || q==null)
			return false;
		
		return p.val==q.val && (isSameTree(p.left, q.left) 
				&& (isSameTree(p.right, q.right)));
			
	}
}

