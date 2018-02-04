package leetcode.medium;

public class AddTwoNumbers_M {

	public static void main(String[] args) {

		ListNode l1 = new ListNode(1);			
		ListNode l2 = new ListNode(9);
		l2.next= new ListNode(9);
		
//		ListNode l1 = new ListNode(0);			
//		ListNode l2 = new ListNode(0);
		
//		ListNode l1 = new ListNode(0);			
//		ListNode l2 = new ListNode(9);
		
//		ListNode l1 = new ListNode(2);			
//		ListNode l2 = new ListNode(9);
		
//		ListNode l1 = new ListNode(2);
//		l1.next=new ListNode(4);
//		l1.next.next=new ListNode(3);
//		
//		ListNode l2 = new ListNode(5);
//		l2.next= new ListNode(6);
//		l2.next.next=new ListNode(4);
		
		//		ListNode l1 = new ListNode(0);
//		l1.next=new ListNode(5);
//		
//		ListNode l2 = new ListNode(0);
//		l2.next= new ListNode(5);

//		ListNode l1 = new ListNode(2);
//		l1.next=new ListNode(4);
//		l1.next.next=new ListNode(3);
//		
//		ListNode l2 = new ListNode(5);
//		l2.next= new ListNode(6);
//		l2.next.next=new ListNode(4);
		ListNode head = Solution36.addTwoNumbers(l1,l2);//342,465
		Solution36.printNodes(head);
	}

}
/*
 * You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
 */
class Solution36{
	//71.46%
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode head = null, l3=null;
		
		int carry=0, sum=0;
		while(l1!=null && l2!=null){
			sum = l1.val+l2.val+carry;
			carry=sum/10;
			int val = sum%10;
			
			if(head==null){
				l3=new ListNode(val);
				head=l3;				
			}
			else{
				l3.next=new ListNode(val);
				l3 = l3.next;
			}
			
			l1=l1.next;
			l2=l2.next;
		}
		
		if(l1!=null)
		{
			l3.next=l1;
			while(carry>0 && l1!=null){
				sum = l1.val + carry;
				carry = sum/10;
				l1.val=sum%10;
				l1 = l1.next;
				l3 = l3.next;
			}
		}
		if(l2!=null){
			l3.next=l2;
			while(carry>0 && l2!=null){
				sum = l2.val + carry;
				carry = sum/10;
				l2.val=sum%10;
				l2 = l2.next;
				l3 = l3.next;
			}
		}
		
		if(carry>0){
			l3.next = new ListNode(carry);
		}
		
		return head;
	}
	
//	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
//		ListNode tail = null;
//		ListNode head = null;
//		int carry=0; int sum=0; //int result=0;
//		
//		while(l1 != null || l2 != null || carry>0){
//			sum=0;
//			if(l1!=null){
//				sum+=l1.val;
//			}
//			if(l2!=null){
//				sum+=l2.val;
//			}
//			sum+=carry;
//			//sum = l1.val+l2.val+carry;
//			
//			if(sum>=10){
//				carry=(int)sum/10;
//				sum = sum%10;
//			}
//			else{
//				carry=0;
//				//result=sum;
//			}
//			
//			if((carry>0) || (sum>0) || l1.next!=null || l2.next!=null){
//				ListNode newNode = new ListNode(sum);
//				if(tail == null){
//					tail = newNode;
//					head=tail;
//				}
//				else{
//					head.next=newNode;
//					head=head.next;
//				}
//				if(l1!=null){
//					l1=l1.next; 
//				}
//				if(l2!=null){
//					l2=l2.next;
//				}
//			}
//		}
//		
//		return tail;
//	}
	
	public static void printNodes(ListNode head){
		while(head!=null){
			System.out.println(head.val);
			if(head.next!=null){
				System.out.println("->");
			}
			head=head.next;
		}
	}
}

class ListNode {
	    int val;
	      ListNode next;
	      ListNode(int x) { val = x; }
}