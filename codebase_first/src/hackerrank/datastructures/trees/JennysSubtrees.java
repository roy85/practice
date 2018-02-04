package hackerrank.datastructures.trees;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class JennysSubtrees {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int r = in.nextInt();
        
        Node new1=null;
        Node new2=null;
        Map<Integer, Node> map = new HashMap<>();
        for(int a0 = 0; a0 < n-1; a0++){
            int x = in.nextInt();
            int y = in.nextInt();
            if(map.containsKey(x)){
            	new1 = map.get(x);
            }
            else{
            	new1 = new Node(x);
            }
            if(map.containsKey(y))
            	new2 = new Node(y);
            else
            	new2 = new Node(y);
            
            new1.next.add(new2);
            new2.next.add(new1);
        }
        
        Set<Integer> setUniques = new HashSet<>();
        for(int i : map.keySet()){	
        	Node x = map.get(i);
        	for(Node j : x.next){
        		
        	}
        }
	}
	
	private static class Node{
		int data;
		List<Node> next;
		
		public Node(int data)
		{
			this.data=data;
		}
	}

}
