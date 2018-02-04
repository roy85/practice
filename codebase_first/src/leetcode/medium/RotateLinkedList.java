package leetcode.medium;

public class RotateLinkedList {

	public static void main(String[] args) {
		ListNode ln = new ListNode(1);
		ln.next = new ListNode(2);
		ln.next.next = new ListNode(3);
//		ln.next.next.next = new ListNode(4);
		
//		while(ln!= null){
//			System.out.print("\t"+ln.val);
//			ln = ln.next;
//		}
		
//		ListNode ln2 = rotateRight(ln, 6);
//		ListNode ln2 = rotateRight(ln, 2);
//		ListNode ln2 = rotateRight(ln, 3);
		ListNode ln2 = rotateRight(ln, 1);
//		ListNode ln2 = rotateRight(ln, 2000000000);
//		ListNode ln2 = rotateRight(null, 0);
		
		System.out.println(ln2);
		
		while(ln2!= null){
			System.out.print("\t"+ln2.val);
			ln2 = ln2.next;
		}
		
	}

	//87.21% - https://discuss.leetcode.com/topic/2861/share-my-java-solution-with-explanation/4
	public static ListNode rotateRight(ListNode head, int k) {
		if(head==null)
	        return null;
		int size = 1; // since we are already at head node
		ListNode fast=head;
		ListNode slow = head;
		
		while(fast.next!=null){
		    size++;
		    fast = fast.next;
		}
		
		for(int i=size-k%size;i>1;i--) // i>1 because we need to put slow.next at the start.
			slow = slow.next;
		
	    // No dummy variable.
		fast.next = head;
		head = slow.next;
		slow.next = null;
		
		return head;
	}
	
	//1 bug - when k>size of list. own idea... would work but no time.
//	public static ListNode rotateRight(ListNode head, int k) {
//        
//		ListNode Nhead=null, fast=head, slow = head;
//		
//		for(int i=0;i<k;i++){
//			fast = fast.next;
//			//if k >= length of list
//			if(fast==null)
//				fast=head;
//		}
//		
//		while(fast.next!=null){
//			fast = fast.next;
//			slow=slow.next;
//		}		
//		Nhead = slow;
//		
//		while(slow.next!=null)
//			slow = slow.next;
//		
//		slow.next=head;
//		while(head.next!=Nhead){
//			head = head.next;
//		}
//		head.next=null;
//		
//		return Nhead;
//    }
	
//	public static ListNode rotateRight(ListNode head, int k) {
//        
//		ListNode Nhead=null, fast=head, slow = head;
//		
//		for(int i=0;i<k;i++){
//			fast = fast.next;
//			//if k >= length of list
//			if(fast==null)
//				fast=head;
//		}
//		
//		while(fast.next!=null){
//			fast = fast.next;
//			slow=slow.next;
//		}		
//		Nhead = slow;
//		
//		while(slow.next!=null)
//			slow = slow.next;
//		
//		slow.next=head;
//		while(head.next!=Nhead){
//			head = head.next;
//		}
//		head.next=null;
//		
//		return Nhead;
//    }
	
//	public static ListNode rotateRight(ListNode head, int k) {
//        
//		if(head == null)
//			return null;
//		
//		if(k<=0)
//			return head;
//		
//		ListNode curr = head;
//		int length = 1;
//		
//		while(curr.next != null){
//			curr = curr.next;
//			length++;
//		}
//		
//		curr.next = head;
//		
//		k = k%length;
//		
//		for(int i=0;i<k;i++){
//			curr = curr.next;
//			head = head.next;
//		}
//		
//		curr.next = null;
//		
//		
//		return head;
//    }
	
}
