package hackerrank.datastructures.trees;

import java.util.Scanner;

public class BSTInsertion {

	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		
//		int n = scan.nextInt();
//		
//		Node root = null;
//		for(int i=0;i<n;i++){
//			root = Insert(root, scan.nextInt());
//		}
//		
//		System.out.println("root="+root.data);
//		
//		scan.close();
		
		Node root = null;
		root = Insert(root, 4);
		root = Insert(root, 2);
		root = Insert(root, 3);
		root = Insert(root, 1);
		root = Insert(root, 7);
		
		System.out.println("root="+root.data);
	}
	
	 	static Node Insert(Node root,int value) {

	        if(root == null)
	        {
	            root = new Node();
	            root.data = value;
	        }
	        
	        else if(root.data>value)
	        {
	            if(root.left == null)
	            {
	                root.left = new Node();
	                root.left.data = value;
	            }    
	            
	            else
	                Insert(root.left, value);
	        }
	        else {
	            if(root.right == null)
	            {
	                root.right = new Node();
	                root.right.data = value;
	            }
	            else
	                Insert(root.right, value);
	        }
	    
	        return root;
	    }
}

//class Node {
//	int data;
//    Node left;
//    Node right;
//}
