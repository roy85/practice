package hackerrank.datastructures.trees;

import java.util.LinkedList;

/*
 * http://algorithms.tutorialhorizon.com/files/2014/12/Print-The-Top-View-of-a-Binary-Tree.1-1.png
 * http://www.geeksforgeeks.org/print-nodes-top-view-binary-tree/ - comments by amrender singh
 */
public class TopView {

	void topView(Node root) {
        
        if(root==null)
            return;
        LinkedList<Integer> s = new LinkedList<>();
       
        Node left = root.left;
        while(left!=null)
        {
            s.addFirst(left.data);
            left = left.left;
        }
        s.add(root.data);
       
        Node right = root.right;       
        while(right!=null){
            s.add(right.data);
            right = right.right;
        }
        
       while(!s.isEmpty()){
            int t = s.poll();
            System.out.print(t+" ");
        }      
    }
	
}
