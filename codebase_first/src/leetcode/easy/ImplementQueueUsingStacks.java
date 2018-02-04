package leetcode.easy;

import java.util.Stack;

public class ImplementQueueUsingStacks {

	public static void main(String[] args) {
		MyQueue mq = new MyQueue();
		System.out.println(mq.empty());
		mq.push(1);
		System.out.println(mq.empty());
		System.out.println(mq.peek());
		mq.push(2);
		mq.push(3);
		System.out.println(mq.empty());
		System.out.println(mq.peek());
		System.out.println(mq.pop());
		System.out.println(mq.empty());
		System.out.println(mq.peek());
		
	}

	
}

class MyQueue {
	Stack<Integer> s1;
	Stack<Integer> s2;
	
    /** Initialize your data structure here. */
    public MyQueue() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        s1.push(x);        
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if(s2.isEmpty()){
        	while(!s1.isEmpty()){
        		s2.push(s1.pop());
        	}        	
        }
        
        return s2.pop();        
    }
    
    /** Get the front element. */
    public int peek() {
        if(s2.isEmpty()){
        	while(!s1.isEmpty()){
        		s2.push(s1.pop());
        	}
        }
        return s2.peek();
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return s1.isEmpty() && s2.isEmpty();
    }
}