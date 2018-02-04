package leetcode.hard;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/*
 * Serialization is the process of converting a data structure or object into a sequence of bits so that it 
 * can be stored in a file or memory buffer, or transmitted across a network connection link to be reconstructed 
 * later in the same or another computer environment.

Design an algorithm to serialize and deserialize a binary tree. There is no restriction on how your 
serialization/deserialization algorithm should work. You just need to ensure that a binary tree can be 
serialized to a string and this string can be deserialized to the original tree structure.

For example, you may serialize the following tree

    1
   / \
  2   3
     / \
    4   5
as "[1,2,3,null,null,4,5]", just the same as how LeetCode OJ serializes a binary tree. You do not necessarily 
need to follow this format, so please be creative and come up with different approaches yourself.
Note: Do not use class member/global/static variables to store states. Your serialize and deserialize 
algorithms should be stateless.
 */
public class SerializeAndDeserializeBinaryTree {

	public static void main(String[] args) {

	}

	
}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
//64.08% - https://raw.githubusercontent.com/hot13399/leetcode-graphic-answer/master/297.%20Serialize%20and%20Deserialize%20Binary%20Tree.jpg
//https://discuss.leetcode.com/topic/28029/easy-to-understand-java-solution/12
class Codec{
	private final String splitter=",";
    private final String na="X";
    
    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        buildString(sb, root);
        return sb.toString();
    }
    
    private void buildString(StringBuilder sb, TreeNode n){
        if(n==null) sb.append(na).append(splitter);
        else{
            sb.append(n.val).append(splitter);
            buildString(sb,n.left);
            buildString(sb,n.right);
        }
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        Queue<String> q = new LinkedList<>();
        q.addAll(Arrays.asList(data.split(splitter)));
        return buildTree(q);
    }
    
    private TreeNode buildTree(Queue<String> q){
        String val = q.poll();
        if(val.equals(na)) return null;
        else{
            TreeNode t = new TreeNode(Integer.valueOf(val));
            t.left = buildTree(q);
            t.right = buildTree(q);
            return t;
        }
    }
}
