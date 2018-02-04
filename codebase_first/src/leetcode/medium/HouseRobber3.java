package leetcode.medium;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class HouseRobber3 {

	public static void main(String[] args) {
//		TreeNode n1 = new TreeNode(1);
//		n1.left = new TreeNode(2);
//		n1.right = new TreeNode(4);
//		n1.left.left = new TreeNode(6);
//		n1.right.right= new TreeNode(8);
//		n1.left.left.right = new TreeNode(11);
//		
//		TreeNode n1 = new TreeNode(4);
//		n1.left = new TreeNode(1);
////		n1.right = new TreeNode(4);
//		n1.left.left = new TreeNode(2);
////		n1.right.right= new TreeNode(8);
//		n1.left.left.left = new TreeNode(3);

		TreeNode n1 = new TreeNode(2);
		n1.left = new TreeNode(1);
		n1.right = new TreeNode(3);
//		n1.left.left = new TreeNode(2);
		n1.left.right= new TreeNode(4);
//		n1.left.left.left = new TreeNode(3);

		
		System.out.println(rob(n1));
	}

	//1ms - 87%
	public static int rob(TreeNode root) {
	    int[] res = robSub(root);
	    return Math.max(res[0], res[1]);
	}

	private static int[] robSub(TreeNode root) {
	    if (root == null) return new int[2];
	    
	    int[] left = robSub(root.left);
	    int[] right = robSub(root.right);
	    int[] res = new int[2];

	    res[0] = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);
	    res[1] = root.val + left[0] + right[0];
	    
	    return res;
	}
	
//	//1138 ms - 6.58%
//	public static int rob(TreeNode root) {
//	    if (root == null) return 0;
//	    return Math.max(robInclude(root), robExclude(root));
//	}
//
//	public static int robInclude(TreeNode node) {
//	    if(node == null) return 0;
//	    return robExclude(node.left) + robExclude(node.right) + node.val;
//	}
//
//	public static int robExclude(TreeNode node) {
//	    if(node == null) return 0;
//	    return rob(node.left) + rob(node.right);
//	}
	
//	public static int rob(TreeNode root) {
//		int totalSum=0;
//		boolean isNullNodeNext = false; 
//		
//		Queue<TreeNode> q = new LinkedList<>();
//		List<Integer> levelSum = new ArrayList<Integer>();
//		
//		if(root!=null){
//			q.add(root);
//			q.add(null);
//			levelSum.add(0);
//			
//			int level=0;
//			
//			while(!q.isEmpty()){
//				TreeNode n = q.poll();
//				if(n==null)
//				{
//					levelSum.remove(level);
//					break;
//				}
//				
//				if(q.peek()==null){
//					isNullNodeNext = true;
//					q.poll();
//				}					
//				else
//					isNullNodeNext = false;
//				
//				levelSum.set(level, levelSum.get(level)+n.val);
//				
//				if(n.left!=null)
//					q.add(n.left);
//				if(n.right!=null)
//					q.add(n.right);
//				
//				
//				if(isNullNodeNext){
//					levelSum.add(0);
//					level++;
//					q.add(null);
//				}
//			}
//			
//			int excl=0;
//			int incl = 0;
//			
//			for(int i=0;i<levelSum.size();i++){
//				int temp = incl;
//				incl = incl > excl+levelSum.get(i) ? incl : excl+levelSum.get(i); 
//				excl = temp;
//			}
//			
//			totalSum = incl > excl? incl : excl;
//		}
//		return totalSum;
//	}
}
