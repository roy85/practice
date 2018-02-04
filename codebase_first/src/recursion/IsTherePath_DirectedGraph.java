package recursion;

public class IsTherePath_DirectedGraph {

	public static void main(String[] args) {
		TreeNode n1 = new TreeNode(1);
		n1.left = new TreeNode(2);
		n1.left.right = new TreeNode(3);
		n1.left.right.left = new TreeNode(4);
		n1.left.right.right = new TreeNode(7);
		n1.left.right.left.right = new TreeNode(5);
		n1.left.right.left.right.right = new TreeNode(6);
		n1.left.right.right.right = new TreeNode(8);
		n1.left.right.right.right.right = new TreeNode(9);
//		TreeNode n2 = new TreeNode(11);
		TreeNode n2 = new TreeNode(6);
		System.out.println(fun(n1, n2));
		
		System.out.println(fun(n1, n1.left.right.left.right.right));
	}

	private static boolean fun(TreeNode node1, TreeNode node2){
		if(node1.left==node2 || node1.right == node2)
			return true;
		if(node1.left==null && node1.right==null)
			return false;
		
		boolean b=false;
		
		if(node1.left!=null)
			b = fun(node1.left, node2);
		if(!b && node1.right!=null)
			b = fun(node1.right, node2);
		
		return b;
	}
}

class TreeNode{
	int val;
	TreeNode left;
	TreeNode right;
	
	public TreeNode(int val)
	{
		this.val = val;
	}
}
