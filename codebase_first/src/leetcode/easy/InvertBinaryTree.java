package leetcode.easy;

import java.util.Stack;

/*
 * Repeat.
 */
public class InvertBinaryTree {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		System.out.println(invertTree(root).val);
	}
	
	/*
	 * 31.55%
	 */
//	public TreeNode invertTree(TreeNode root) {
//	    if (root == null) {
//	        return null;
//	    }
//	    TreeNode right = invertTree(root.right);
//	    TreeNode left = invertTree(root.left);
//	    root.left = right;
//	    root.right = left;
//	    return root;
//	}
	
	/*
	 * 31.55%
	 */
//	public TreeNode invertTree(TreeNode root) {
//        if (root == null) return null;
//        Queue<TreeNode> queue = new LinkedList<TreeNode>();
//        queue.add(root);
//        while (!queue.isEmpty()) {
//            TreeNode current = queue.poll();
//            TreeNode temp = current.left;
//            current.left = current.right;
//            current.right = temp;
//            if (current.left != null) queue.add(current.left);
//            if (current.right != null) queue.add(current.right);
//        }
//        return root;
//    }
	
	/*
	 * 1.x%
	 */
	public static TreeNode invertTree(TreeNode root) {
		
		if(root==null)
			return null;
		
		Stack<TreeNode> stack = new Stack<>();
		TreeNode temp = null;
		
		stack.push(root);
		
		while(!stack.isEmpty()){
			TreeNode n = stack.pop();
			temp = n.left;
			n.left = n.right;
			n.right = temp;
			
			if(n.left != null && (n.left.left!=null || n.left.right !=null)){
				stack.push(n.left);
			}
			if(n.right!= null && (n.right.left!=null || n.right.right!=null)){
				stack.push(n.right);
			}
		}
		
		return root;
	}

}

// class TreeNode {
//     int val;
//     TreeNode left;
//     TreeNode right;
//     TreeNode(int x) { val = x; }
// }