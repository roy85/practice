package leetcode.easy;

public class ReverseSinglyLinkedList {

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		head.next=new ListNode(2);
		head.next.next=new ListNode(3);
		head.next.next.next=new ListNode(4);
		
//		ListNode head = new ListNode(1);
		
//		ListNode head = null;
		
		ListNode node = reverseList(head);
		if(node == null) System.out.println("node is null");
		
		while(node!=null){
			System.out.print("\t"+node.val);
			node = node.next;
		}
		
	}

	//37.17% - top slab
	public static ListNode reverseList(ListNode head) {
		if(head == null) return null;
		if(head.next==null) return head;
		
		ListNode prev = null;
		ListNode nextHead = null; 
		
		while(head != null){
			nextHead = head.next;
			head.next=prev;
			prev = head;
			head = nextHead;
		}
		
		return prev;
	}
}
