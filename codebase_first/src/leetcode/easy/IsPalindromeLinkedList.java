package leetcode.easy;

import java.util.Stack;

/*
 * Not Completed.
 */
public class IsPalindromeLinkedList {

	public static void main(String[] args) {
//		ListNode head = new ListNode(1);
//		head.next=new ListNode(2);
//		head.next.next=new ListNode(3);
//		head.next.next.next=new ListNode(2);
//		head.next.next.next.next=new ListNode(1);
		
		ListNode head = new ListNode(1);
		head.next=new ListNode(2);
		head.next.next=new ListNode(3);
		head.next.next.next=new ListNode(3);
		head.next.next.next.next=new ListNode(2);
		head.next.next.next.next.next = new ListNode(1);
		
		System.out.println(isPalindrome(head));
		
	}

	public static boolean isPalindrome(ListNode head) {
		if(head == null) return false;
		
		boolean isPalindrome = true;
				
		ListNode compareSlow = null;
		ListNode compareFast = null;
		ListNode slow = null;
		ListNode fast = null;
		ListNode prev = null;
		int n=0;		
		
		if(slow == null){
			slow = head;
			compareSlow=slow;
		}
		if(fast == null){
			prev = head;
			fast = head.next;
			n++;
		}
		
		//Move fast and slow pointers
		while(fast !=null && fast.next!=null){
			slow = slow.next;
			prev = fast.next;
			fast = fast.next.next;
			n++;
		}
		
		//Put prev nodes on stack
		Stack<ListNode> stack = new Stack<>();
		ListNode tempPtr = slow;
		if(fast!=null){//even number of nodes
			tempPtr = slow.next;			
		}
		else {
			tempPtr = slow;
		}
		while(tempPtr!= fast){				
			stack.add(tempPtr);
			tempPtr = tempPtr.next;
		}
		if(fast!=null){
			stack.add(fast);
		}
		
		compareFast = fast;
		
		//Now reverse
		while(n>0){
			prev = stack.pop();
			fast.next = prev;
			fast = fast.next;
			prev.next=null;
			n--;
		}
		
		while(compareSlow!=null && compareFast!=null){
			if(compareSlow.val!=compareFast.val){
				isPalindrome=false;
				break;
			}
			compareSlow = compareSlow.next;
			compareFast = compareFast.next;
		}
		
		return isPalindrome;
	}
}
