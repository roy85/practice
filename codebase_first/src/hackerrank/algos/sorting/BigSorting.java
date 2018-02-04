package hackerrank.algos.sorting;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BigSorting {

	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] unsorted = new String[n];
        for(int unsorted_i=0; unsorted_i < n; unsorted_i++){
            unsorted[unsorted_i] = in.next();
        }
        
        Map<String, BigInteger> map = new HashMap<>();
        BigInteger val = new BigInteger(unsorted[0]);
        map.put(unsorted[0], val);
        Node root = new Node(val);
        
        for(int i=1;i<n;i++){
        	if(!map.containsKey(unsorted[i])){
        		val = new BigInteger(unsorted[i]);
        		map.put(unsorted[i], val);
        	}
        	else
        		val = map.get(unsorted[i]);
        	addNodeToBST(root, val);
        }
        printBST(root);
        in.close();
    }
	
	private static void printBST(Node root) {
		if(root == null)
			return;
		
		printBST(root.right);
		System.out.println(root.data);
		printBST(root.left);		
	}

	private static void addNodeToBST(Node root, BigInteger val){
		Node newNode = new Node(val);
		while(root!=null){
			if(root.data.compareTo(val)==-1){
				if(root.left==null)
				{
					root.left=newNode;
					break;
				}
				else
					root = root.left;
			}
			else{
				if(root.right == null){
					root.right = newNode;					
					break;
				}
				else
					root = root.right;
			}
		}
	}
	
	private static class Node{
		BigInteger data;
		Node left;
		Node right;
		
		public Node(BigInteger val){
			this.data = val;
		}
	}
}
