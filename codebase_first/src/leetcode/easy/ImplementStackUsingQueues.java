package leetcode.easy;

import java.util.LinkedList;
import java.util.Queue;

/*
 * Improve
 */
public class ImplementStackUsingQueues {

	public static void main(String[] args) {
		MyStack obj = new MyStack();
		  obj.push(2);obj.push(4);obj.push(6);obj.push(8);System.out.println(obj.toString());
		  int param_2 = obj.pop();System.out.println("param_2="+param_2);
		  int param_3 = obj.top();System.out.println("param_3="+param_3);
		  boolean param_4 = obj.empty();System.out.println("param_4="+param_4);
//	
		  /*
		   * leetcode.easy.MyStack@7852e922
param_2=8
param_3=6
param_4=false
		   */
		  
		  
//		MyStack obj = new MyStack();
//		  obj.push(1);obj.push(2);
//		  int param_2 = obj.top();System.out.println("param_2="+param_2);
//		  int param_3 = obj.top();System.out.println("param_3="+param_3);
//		  boolean param_4 = obj.empty();System.out.println("param_4="+param_4);
	}

	
}

//22.63%
class MyStack {
	Queue<Integer> q;
	
    /** Initialize your data structure here. */
    public MyStack() {
        q = new LinkedList<>();
    }
    
    /** Push element x onto stack. */
    public void push(int x) {
        q.add(x);
    }
    
    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        if(q.isEmpty())
        	return Integer.MIN_VALUE;
        else{
        	for(int i=0;i<q.size()-1;i++){
        		
        		q.add(q.remove());
        	}
        	
        	return q.remove();
        }
    }
    
    /** Get the top element. */
    public int top() {
    	if(q.isEmpty())
    		return Integer.MIN_VALUE;
    	else{
        	for(int i=0;i<q.size()-1;i++){
        		q.add(q.remove());
        	}
        	int retValue = q.peek();
        	q.add(q.remove());
        	return retValue;
    	}
    		
    }
    
    /** Returns whether the stack is empty. */
    public boolean empty() {
        return q.isEmpty();
    }
}
