package leetcode.easy;

public class RemoveElementsFromLinkedList {

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
		
//		ListNode head = new ListNode(2);

		ListNode head = new ListNode(1);
		head.next=new ListNode(2);
		head.next.next=new ListNode(3);
		head.next.next.next=new ListNode(4);

		
		ListNode node = removeElements(head, 6);
		if(node==null) System.out.println("node is null");
		
		while(node!=null){
			System.out.print("\t"+node.val);
			node = node.next;
		}
		
		
	}

	//11.46%
	public static ListNode removeElements(ListNode head, int val) {
		
		if(head == null || (head.val==val && head.next==null)) return null;
		
		ListNode current = head;
		ListNode prev = new ListNode(Integer.MIN_VALUE);
		prev.next=current;
		
		
		
		while(current!=null){
			
			if(current.val==val){
				if(current == head){
					head = head.next;
				}
				prev.next = current.next;
			}
			else{
				prev = prev.next;
			}
			
			current = current.next;
			
		}
		
		
		
		return head;
	}
}

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
