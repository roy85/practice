package leetcode.medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class FindBottomLeftTreeValue {

	public static void main(String[] args) {

	}

	public static int findBottomLeftValue(TreeNode root) {
		
		int val=0;
		
		List<Integer> L = new ArrayList<>();
		Stack<TreeNode> s = new Stack<>();
		int level=0;
		
		L.add(root.val);//add left node at level0
		if(root.left!=null || root.right!= null){
			//if left node is not null
			if(root.left!=null)
			{
				//increment level. add left value to Left for that level. 
				//Assumption is that level and L's index are same here.
				L.add(root.left.val);level++;
				//new root is left child.
				root = root.left;
				//push right node to stack even when it is empty
				s.push(root.right);
			}
			else{
				//if left child is null, move root to right node.
				root = root.right;
			}
			
		}
		
		
		return 0;
	}
}
