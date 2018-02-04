package hackerrank.datastructures.trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SwapNodes_Medium {

	public static void main(String[] args) {

		Queue<Node3> q = new LinkedList<>();
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		Node3 root = new Node3(1);		
		
		
		q.offer(root);
		for(int i=0;i<n && !q.isEmpty();i++){
			int l = scan.nextInt();
			int r = scan.nextInt();
			
			Node3 temp = q.poll();
			
			if(l!=-1)
			{
				temp.left = new Node3(l);
				q.offer(temp.left);
			}
			if(r!=-1)
			{
				temp.right = new Node3(r);
				q.offer(temp.right);
			}
		}
		
		int t = scan.nextInt();
		int[] arrayT = new int[t];
		for(int i=0;i<t;i++){
			arrayT[i] = scan.nextInt();
		}
		printTree(root);System.out.println();
		scan.close();
		
//		Node3 root = new Node3(1);
//		root.left=new Node3(2);
//		root.right=new Node3(3);
//		root.left.right = new Node3(4);
//		root.right.right=new Node3(5);
		
		
//		int t = 2;
//		int[] arrayT = {1,1};
//		int t = 1;
//		int[] arrayT = {2};
		q.clear();
		q.offer(root);
		Node3 dummy = new Node3(Integer.MIN_VALUE);
		q.offer(dummy);
		int h=1;
		for(int i=0;i<t;i++){
			while(!q.isEmpty()){
				Node3 temp = q.poll();
				if(temp.data==Integer.MIN_VALUE)
				{
					h++;
					if(!q.isEmpty())
						q.offer(dummy);
					continue;
				}
				
				if((h)%arrayT[i]==0 && (temp.left!=null || temp.right != null)){
					Node3 temp2 = temp.right;
					temp.right=temp.left;
					temp.left=temp2;
					if(q.peek().data == Integer.MIN_VALUE){
						printTree(root);
						System.out.println();
					}
				}
				
				if(temp.left!=null)
					q.offer(temp.left);
				if(temp.right!=null)
					q.offer(temp.right);
			}
			q.offer(root);
			h=1;
		}
	}

	private static void printTree(Node3 root) {
		if(root == null)
			return;
		
		printTree(root.left);
		System.out.print(root.data);
		printTree(root.right);
	}

}

class Node3{
	int data;
	Node3 left;
	Node3 right;
	
	public Node3(int data){
		this.data=data;
	}
}