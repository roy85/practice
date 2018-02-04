package leetcode.easy;

public class ClosestBST {

	public static void main(String[] args) {
		
	}

	public static int closestValue(TreeNode root, double target) {
		if((double)root.val==target)
			return root.val;
		else if((double)root.left.val==target)
			return root.left.val;
		else if((double)root.right.val==target)
			return root.right.val;
		
		double diffRootVal=(double)root.val-target;
		double diffLeftVal=root.left==null?Double.MAX_VALUE:((double)root.left.val-target);
		double diffRighttVal=root.left==null?Double.MAX_VALUE:((double)root.right.val-target);
		
		//target > root.val
		if(diffRootVal<0){
			if(diffLeftVal>0)
				return 
		}
	}
}
