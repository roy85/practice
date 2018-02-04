package leetcode.easy;

public class OverlayBinaryTrees {

	public static void main(String[] args) {
		TreeNode n1 = new TreeNode(1);
		TreeNode n2 = new TreeNode(2);
		n1.left = new TreeNode(2);
		n2.left = new TreeNode(3);
		n1.right = new TreeNode(4);
		n2.right = new TreeNode(5);
		n1.left.left = new TreeNode(6);
		n2.left.right = new TreeNode(7);
		n1.right.right= new TreeNode(8);
		n2.right.left = new TreeNode(9);
		n1.left.left.right = new TreeNode(11);
		
		
		TreeNode h = mergeTrees(n1, n2);
		System.out.println(h);
		if(h!=null){
			System.out.println(h.val);
			System.out.println(h.left.val);
			System.out.println(h.right.val);
			System.out.println(h.left.left.val);
			System.out.println(h.left.right.val);
			System.out.println(h.right.right.val);
			System.out.println(h.right.left.val);
			System.out.println(h.left.left.right.val);
		}
			
	}

	public static TreeNode mergeTrees(TreeNode t1, TreeNode t2){

		if(t1==null && t2==null)
			return null;
		
		TreeNode r = null;
		
		if(t1!=null && t2!=null){
			r = new TreeNode(t1.val+t2.val);
		}
		else if(t1!=null){
			r = new TreeNode(t1.val);
		}
		else if(t2!=null){
			r = new TreeNode(t2.val);
		}
		
		r.left = mergeTrees(t1==null?null:t1.left, t2==null?null:t2.left);
		r.right = mergeTrees(t1==null?null:t1.right, t2==null?null:t2.right);
		
		return r;
	}
}
