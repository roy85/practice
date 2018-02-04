package hackerrank.datastructures.trees;
import java.util.Scanner;

public class GetHeight {

	static int height(Node root) {
      	if(root == null || (root.left == null && root.right == null))
            return 0;
        
        return Math.max(height(root.left), height(root.right)) + 1;
    }

	
	public static Node insert(Node root, int data) {
        if(root == null){
            return new Node(data);
        }
        else {
            Node cur;
            if(data <= root.data){
                cur = insert(root.left, data);
                root.left = cur;
            }
            else{
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }
	
	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while(t-- > 0){
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        int height = height(root);
        System.out.println(height);
    }
	
}

class Node {
    Node left;
    Node right;
    int data;
    
    Node(){
    	
    }
    
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}