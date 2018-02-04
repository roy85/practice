package leetcode.easy;
//6:12->
public class LinkedListCycle {

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
//		head.next=head;
		head.next=new ListNode(2);
		head.next.next=new ListNode(3);
		head.next.next.next=head;
//		head.next.next.next=new ListNode(4);
//		head.next.next.next.next=head;
		System.out.println(hasCycle(head));
//		System.out.println(hasCycle(null));
	}

	//7.74% - Best
	public static boolean hasCycle(ListNode head) {
		boolean hasCycle=false;
		
		ListNode n1 = head;
		ListNode n2 = head;
		
		while(n1!=null && n2!=null){
			n1=n1.next;
			if(n2.next!=null){
				n2 = n2.next.next;
			}
			else{
				return false;
			}
			
			if(n1==n2){
				return true;
			}
		}
		
		return hasCycle;
	}
}
