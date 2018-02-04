package leetcode.easy;

import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoLinkedLists {

	public static void main(String[] args) {
		ListNode headA = new ListNode(11);
		headA.next=new ListNode(12);
		headA.next.next=new ListNode(13);
		headA.next.next.next=new ListNode(14);
		headA.next.next.next.next=new ListNode(15);
		
		ListNode headB = new ListNode(21);
		headB.next=new ListNode(22);
		headB.next.next=new ListNode(23);
		headB.next.next.next=headA.next.next;
		
		System.out.println(getIntersectionNode(headA, headB).val);
	}

	public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		Set<ListNode> set = new HashSet<>();
		
		while(headA!=null || headB!=null){
			if(headA!=null && set.add(headA)){
				headA=headA.next;
			}
			else
				return headA;
			
			if(headB!=null && set.add(headB)){
				headB=headB.next;
			}
			else
				return headB;
		}
		
		return null;
	}
}
