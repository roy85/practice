package leetcode.easy;

import java.util.Stack;
/*
 * 155. Min Stack: https://leetcode.com/problems/min-stack/#/description
 * 
 * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

push(x) -- Push element x onto stack.
pop() -- Removes the element on top of the stack.
top() -- Get the top element.
getMin() -- Retrieve the minimum element in the stack.
Example:
MinStack minStack = new MinStack();
minStack.push(-2);
minStack.push(0);
minStack.push(-3);
minStack.getMin();   --> Returns -3.
minStack.pop();
minStack.top();      --> Returns 0.
minStack.getMin();   --> Returns -2.


 */
public class MinStack {

	public static void main(String[] args) {
		MinStack2 minStack = new MinStack2();
		minStack.push(-2);
		minStack.push(0);
		minStack.push(-3);
		System.out.println(minStack.getMin());   //--> Returns -3.
		minStack.pop();
		System.out.println(minStack.top());      //--> Returns 0.
		System.out.println(minStack.getMin());   //--> Returns -2.
	}
}

/*Better: https://discuss.leetcode.com/topic/4953/share-my-java-solution-with-only-one-stack/10
 * class MinStack
{
    static class Element
    {
        final int value;
        final int min;
        Element(final int value, final int min)
        {
            this.value = value;
            this.min = min;
        }
    }
    final Stack<Element> stack = new Stack<>();
    
    public void push(int x) {
        final int min = (stack.empty()) ? x : Math.min(stack.peek().min, x);
        stack.push(new Element(x, min));
    }

    public void pop()
    {
        stack.pop();
    }

    public int top()
    {
        return stack.peek().value;
    }

    public int getMin()
    {
        return stack.peek().min;
    }
}
 */

//72.03%
class MinStack2 {
	Stack<Integer> s;
	int min = Integer.MAX_VALUE;
	
    /** initialize your data structure here. */
    public MinStack2() {
        s = new Stack<>();
    }
    
    public void push(int x) {
        if(x<min)
        	min = x;
        s.push(x);
    }
    
    public void pop() {
        int x = s.pop();
        if(x==min){
        	min = Integer.MAX_VALUE;
        	Stack<Integer> s2 = new Stack<>();
        	while(!s.empty()){
        		int y = s.pop();
        		if(y<min)
        			min = y;
        		s2.push(y);
        	}
        	while(!s2.empty()){
        		int y = s2.pop();
        		if(y<min)
        			min = y;
        		s.push(y);
        	}
        }
    }
    
    public int top() {
        return s.peek();
    }
    
    public int getMin() {
        return min;
    }
}
