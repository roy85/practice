package leetcode.medium;

public class LinkedListCycle2 {

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
//		head.next=head;
//		head.next=new ListNode(2);
//		head.next.next=new ListNode(3);
//		head.next.next.next=head;
//		head.next.next.next=new ListNode(4);
//		head.next.next.next.next = head.next.next;
//		head.next.next.next.next=head;
		ListNode result = detectCycle(null);
//		ListNode result = detectCycle(head);
		
		System.out.println(result);
		if(result!=null) System.out.println(result.val);
	}

	//18.87%-Best
	public static ListNode detectCycle(ListNode head) {
		
		ListNode n1 = head;
		ListNode n2 = head;
		
		
		while(n1!=null && n2!=null){
			n1=n1.next;
			if(n2.next!=null){
				n2 = n2.next.next;
			}
			else{
				return null;
			}
			
			if(n1==n2){
				break;
			}
		}
		
		if(n2!=null){
			n1 = head;
			if(n2==n1){
				return n1;
			}
			while(n2!=n1){
				n1 = n1.next;
				n2=n2.next;
				if(n1==n2){
					return n1;
				}
			}
		}
		
		return null;
	}
}
