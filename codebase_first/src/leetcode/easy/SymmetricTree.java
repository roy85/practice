package leetcode.easy;

import java.util.LinkedList;
import java.util.Queue;

public class SymmetricTree {

	public static void main(String[] args) {
//		TreeNode t = new TreeNode(1);
//		t.left = new TreeNode(2);
//		t.left.left=new TreeNode(3);
//		t.left.right=new TreeNode(4);
//		t.right=new TreeNode(2);
//		t.right.right = new TreeNode(3);
//		t.right.left = new TreeNode(4);
//		System.out.println(isSymmetric(t));
		
		
		TreeNode t = new TreeNode(1);
		t.left = new TreeNode(5);
//		t.left.left=new TreeNode(3);
		t.left.right=new TreeNode(3);
		t.right=new TreeNode(5);
		t.right.right = new TreeNode(3);
//		t.right.left = new TreeNode(4);
		System.out.println(isSymmetric(t));
	}

	//13.03% - leetcode article 
	public static boolean isSymmetric(TreeNode root){
		 Queue<TreeNode> q = new LinkedList<>();
		    q.add(root);
		    q.add(root);
		    while (!q.isEmpty()) {
		        TreeNode t1 = q.poll();
		        TreeNode t2 = q.poll();
		        if (t1 == null && t2 == null) continue;
		        if (t1 == null || t2 == null) return false;
		        if (t1.val != t2.val) return false;
		        q.add(t1.left);
		        q.add(t2.right);
		        q.add(t1.right);
		        q.add(t2.left);
		    }
		    return true;
	}

	
	//5.07% - copied
//	public static boolean isSymmetric(TreeNode root){
//		if(root==null)  return true;
//	    
//	    Stack<TreeNode> stack = new Stack<TreeNode>();
//	    TreeNode left, right;
//	    if(root.left!=null){
//	        if(root.right==null) return false;
//	        stack.push(root.left);
//	        stack.push(root.right);
//	    }
//	    else if(root.right!=null){
//	        return false;
//	    }
//	        
//	    while(!stack.empty()){
//	        if(stack.size()%2!=0)   return false;
//	        right = stack.pop();
//	        left = stack.pop();
//	        if(right.val!=left.val) return false;
//	        
//	        if(left.left!=null){
//	            if(right.right==null)   return false;
//	            stack.push(left.left);
//	            stack.push(right.right);
//	        }
//	        else if(right.right!=null){
//	            return false;
//	        }
//	            
//	        if(left.right!=null){
//	            if(right.left==null)   return false;
//	            stack.push(left.right);
//	            stack.push(right.left);
//	        }
//	        else if(right.left!=null){
//	            return false;
//	        }
//	    }
//	    
//	    return true;
//	}

	//23.03%
//	public static boolean isSymmetric(TreeNode root) {
//        if(root==null) return true;
//        return isMirror(root.left,root.right);
//    }
//    
//    private static boolean isMirror(TreeNode p, TreeNode q) {
//        if(p==null && q==null) return true;
//        if(p==null || q==null) return false;
//        return (p.val==q.val) && isMirror(p.left,q.right) && isMirror(p.right,q.left);
//    }
	static class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
}
