package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		
//		TreeNode root = new TreeNode(1);
//		root.left = new TreeNode(2);
		
//		TreeNode root = new TreeNode(1);
//		root.left = new TreeNode(2);
//		root.right = new TreeNode(3);
		
		List<String> paths = binaryTreePaths(root);
		for(String s : paths){
			System.out.println(s);
		}
	}

	private static List<String> list;
	
	public static List<String> binaryTreePaths(TreeNode root){
		if(root==null){
			return null;
		}
		
		list = new ArrayList<>();
		
		fun(root, new StringBuilder());
		
		return list;
	}

	private static void fun(TreeNode root, StringBuilder sb) {
		if(root==null)
			return;
				
		if(root.left==null && root.right==null){
			StringBuilder sb2 = new StringBuilder(sb.toString());
			
			if(sb2.length()>0)
				sb2.append("->");
			sb2.append(root.val);
			
			list.add(sb2.toString());			
			return;
		}
		
		if(sb.length()>0)
			sb.append("->");
		sb.append(root.val);
		
		fun(root.left, sb);
		fun(root.right, sb);
	}
	
//	public static List<String> binaryTreePaths(TreeNode root) {
//		List<String> paths = new ArrayList<>();
//		
//		if(root==null){
//			return null;
//		}
//		
//		Queue<TreeNode> queue = new LinkedList<TreeNode>();
//		queue.add(root);
//		String p = "";
//		while(!queue.isEmpty()){
//			TreeNode current = queue.poll();
//			if(p!=""){
//				p+="->";
//			}
//			p+=current.val;
//			
//			if(current.left!=null){
////				p+="->";
//				queue.add(current.left);
//			}
//			if(current.right!=null){
////				p+="->";
//				queue.add(current.right);
//			}
//			if(current.left==null && current.right==null){
//				paths.add(p);
//				p="";
//			}
//		}
//		
//		return paths;
//	}
}

