package leetcode.easy;

public class MergeSortedLinkedLists {

	public static void main(String[] args) {

//		ListNode l1 = new ListNode(1);
//		l1.next = new ListNode(3);
//		l1.next.next=new ListNode(5);
//		l1.next.next.next = new ListNode(7);		
//		
//		ListNode l2 = new ListNode(2);
//		l2.next=new ListNode(4);
//		l2.next.next=new ListNode(6);
//		l2.next.next.next = new ListNode(8);
		
//		ListNode l1 = new ListNode(1);
//		l1.next = new ListNode(3);
//		l1.next.next=new ListNode(5);
//		l1.next.next.next = new ListNode(7);		
//		
//		ListNode l2 = null;
		
//		ListNode l1 = null;				
//		
//		ListNode l2 = new ListNode(2);
//		l2.next=new ListNode(4);
//		l2.next.next=new ListNode(6);
//		l2.next.next.next = new ListNode(8);

//		ListNode l1 = null;				
//		
//		ListNode l2 = null;
		
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(2);
		l1.next.next=new ListNode(3);
		l1.next.next.next = new ListNode(4);		
		
		ListNode l2 = new ListNode(5);
		l2.next=new ListNode(6);
		l2.next.next=new ListNode(7);
		l2.next.next.next = new ListNode(8);
		
		
		ListNode head = mergeTwoLists(l1, l2);
		
		if(head==null) System.out.println("head is null");
		
		while(head!=null){
			System.out.print("\t"+head.val);
			head = head.next;
		}
		
	}

	//56.06%
	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		
		ListNode list = null;
		ListNode head = null;
		
		while(l1!=null || l2!=null){
			if(l1!=null && l2!=null){
				if(l1.val<l2.val){
					if(list == null){
						list = new ListNode(l1.val); 
						head = list;						
					}
					else{
						list.next = new ListNode(l1.val);						
						list = list.next;
					}
					l1 = l1.next;
				}
				else{
					if(list == null){
						list = new ListNode(l2.val);
						head = list;
					}
					else{
						list.next = new ListNode(l2.val);						
						list = list.next;
					}
					l2 = l2.next;
				}
			}
			
			if(l1==null && l2!=null){
				if(list == null){
					list = l2;
					head = list;
				}
				else{
					list.next = l2;
				}				
				break;
			}
			if(l1!=null && l2==null){
				if(list == null){
					list = l1;
					head = list;
				}
				else{
					list.next = l1;
				}
				break;
			}
		}
		
		return head;
	}
}
