package leetcode.medium;

/*
 * Given a binary tree, collect a tree's nodes as if you were doing this: Collect and remove all leaves, repeat until the tree is empty.

Example:
Given binary tree 
          1
         / \
        2   3
       / \     
      4   5    
Returns [4, 5, 3], [2], [1].

Explanation:
1. Removing the leaves [4, 5, 3] would result in this tree:

          1
         / 
        2          
2. Now removing the leaf [2] would result in this tree:

          1          
3. Now removing the leaf [1] would result in the empty tree:

          []         
Returns [4, 5, 3], [2], [1].
 */
public class FindLeavesOfBinaryTree {

	public static void main(String[] args) {

	}
}
	/*
	 * For this question we need to take bottom-up approach. The key is to find the height of each node. 
	 * Here the definition of height is:
The height of a node is the number of edges from the node to the deepest leaf. --CMU 15-121 Binary Trees

I used a helper function to return the height of current node. According to the definition, the height of leaf is 0. 
h(node) = 1 + max(h(node.left), h(node.right)).
The height of a node is also the its index in the result list (res). For example, leaves, whose heights are 0, are 
stored in res[0]. Once we find the height of a node, we can put it directly into the result.

UPDATE:
Thanks @adrianliu0729 for pointing out that my previous code does not actually remove leaves. 
I added one line node.left = node.right = null; to remove visited nodes

UPDATE:
There seems to be some debate over whether we need to actually "remove" leaves from the input tree. 
Anyway, it is just a matter of one line code. In the actual interview, just confirm with the interviewer 
whether removal is required.
	 */

	
	//21% - https://discuss.leetcode.com/topic/49194/10-lines-simple-java-solution-using-recursion-with-explanation 
//	public List<List<Integer>> findLeaves(TreeNode root) {
//        List<List<Integer>> res = new ArrayList<>();
//        height(root, res);
//        return res;
//    }
//    private int height(TreeNode node, List<List<Integer>> res){
//        if(null==node)  return -1;
//        int level = 1 + Math.max(height(node.left, res), height(node.right, res));
//        if(res.size()<level+1)  res.add(new ArrayList<>());
//        res.get(level).add(node.val);
//        return level;
//    }
	
/*
 * The essential of problem is not to find the leaves, but group leaves of same level together and also to cut the tree. 
 * This is the exact role backtracking plays. The helper function returns the level which is the distance from its 
 * furthest subtree leaf to root, which helps to identify which group the root belongs to
 */
	//21% - https://discuss.leetcode.com/topic/49206/java-backtracking-o-n-time-o-n-space-no-hashing
//	public List<List<Integer>> findLeaves(TreeNode root) {
//        List<List<Integer>> list = new ArrayList<>();
//        findLeavesHelper(list, root);
//        return list;
//    }
//    
//// return the level of root
//    private int findLeavesHelper(List<List<Integer>> list, TreeNode root) {
//        if (root == null) {
//            return -1;
//        }
//        int leftLevel = findLeavesHelper(list, root.left);
//        int rightLevel = findLeavesHelper(list, root.right);
//        int level = Math.max(leftLevel, rightLevel) + 1;
//        if (list.size() == level) {
//            list.add(new ArrayList<>());
//        }
//        list.get(level).add(root.val);
//        root.left = root.right = null;
//        return level;
//    }
}

/*
 * NOT TESTED: https://discuss.leetcode.com/topic/49400/1-ms-easy-understand-java-solution/9
 * public class Solution {
    public List<List<Integer>> findLeaves(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        while (root != null) {
            List<Integer> temp = new ArrayList<Integer>();
            root = removeLeaves(root, temp);
            res.add(temp);
        }
        return res;
    }
    
    private TreeNode removeLeaves(TreeNode root, List<Integer> temp) {
        if (root == null) return null;
        if (root.left == null && root.right == null) {
            temp.add(root.val);
            return null;
        }
        root.left = removeLeaves(root.left, temp);
        root.right = removeLeaves(root.right, temp);
        return root;
    }
}
 */
*/