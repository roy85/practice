package leetcode.easy;

import java.util.LinkedList;
import java.util.Queue;

public class DFSPrint {

	///Personal code
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
		
//		printBSTDFS(root);
		printBSTBFS(root);
	}

	public static void printBSTDFS(TreeNode root){
		if(root==null)
			return;
		System.out.println(root.val);
		printBSTDFS(root);
		printBSTDFS(root.right);
	}
	
	public static void printBSTBFS(TreeNode root){
		if(root==null)
			return;
		
		Queue<TreeNode> q = new LinkedList<>();
		q.add(root);
		
		while(!q.isEmpty()){
			TreeNode t = q.poll();
			if(t==null)
				System.out.println("null");
			else
			{
				System.out.println(t.val);
				q.add(t.left);
				q.add(t.right);
			}			
		}
	}
}
