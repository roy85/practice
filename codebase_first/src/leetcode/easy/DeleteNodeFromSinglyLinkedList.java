package leetcode.easy;

public class DeleteNodeFromSinglyLinkedList {

	public static void main(String[] args) {
//		ListNode head = new ListNode(1);
//		head.next = new ListNode(2);
//		head.next.next = new ListNode(6);
//		head.next.next.next=new ListNode(3);
//		head.next.next.next.next = new ListNode(4);
//		head.next.next.next.next.next=new ListNode(5);
//		head.next.next.next.next.next.next=new ListNode(6);
		
//		ListNode head = new ListNode(6);
		
//		ListNode head = new ListNode(6);
//		head.next=new ListNode(2);
		
//		ListNode head = new ListNode(6);
//		head.next=new ListNode(6);
//		head.next.next=new ListNode(6);
//		head.next.next.next=new ListNode(6);
		
//		ListNode head = new ListNode(6);
//		head.next=new ListNode(2);
//		head.next.next=new ListNode(6);
//		head.next.next.next=new ListNode(6);
		
		ListNode head = new ListNode(2);

//		ListNode head = new ListNode(1);
//		head.next=new ListNode(2);
//		head.next.next=new ListNode(3);
//		head.next.next.next=new ListNode(4);

		
//		deleteNode(head.next);
		deleteNode(head);
//		deleteNode(head.next.next);
//		deleteNode(head.next.next.next);
		if(head==null) System.out.println("node is null");
		
		while(head!=null){
			System.out.print("\t"+head.val);
			head = head.next;
		}
	}

	//10.69%
	public static void deleteNode(ListNode node) {
	    node.val = node.next.val;
	    node.next = node.next.next;
	}

	
	//0.77%
//	public static void deleteNode(ListNode node) {
//		if(node != null){
//			if(node.next!=null){
//				node.val=node.next.val;
//				node.next=node.next.next;
//			}
//		}
//	}

}
