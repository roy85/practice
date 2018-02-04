package leetcode.easy;

public class ReverseLinkedList {

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		head.next=new ListNode(2);
		head.next.next=new ListNode(3);
		head.next.next.next=new ListNode(4);
		
		ListNode h = reverseList(head);
		printList(h);
	}
	
	private static void printList(ListNode head){
		while(head!=null){
			System.out.println(head.val);
			head = head.next;
		}
	}

	public static ListNode reverseList(ListNode head) {
		ListNode prev=null;
		while(head!=null){
			ListNode neighbor = head.next;
			head.next = prev;
			prev = head;
			head = neighbor;
			
		}
		
		return prev;
	}
}

