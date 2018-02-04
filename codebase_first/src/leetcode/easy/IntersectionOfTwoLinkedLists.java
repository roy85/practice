package leetcode.easy;

/*
 * Can improve
 */
public class IntersectionOfTwoLinkedLists {

	public static void main(String[] args) {
		
//		ListNode headA = new ListNode(1);
//		ListNode headB = new ListNode(6);
		
//		ListNode headA = new ListNode(1);
//		headA.next = new ListNode(2);
//		ListNode headB = new ListNode(6);
//		headB.next=headA.next;
		
		ListNode headA = new ListNode(1);
		headA.next = new ListNode(2);
		headA.next.next=new ListNode(3);
		headA.next.next.next=new ListNode(4);
		headA.next.next.next.next=new ListNode(5);
		ListNode headB = new ListNode(6);
		headB.next=headA.next.next;
		
		
//		ListNode headA = new ListNode(1);
//		headA.next = new ListNode(2);
//		headA.next.next=new ListNode(3);
//		headA.next.next.next=new ListNode(4);
//		headA.next.next.next.next=new ListNode(5);
//		ListNode headB = new ListNode(6);
//		headB.next=new ListNode(7);
//		headB.next.next=new ListNode(8);
//		headB.next.next.next=headA.next.next;
		
		ListNode common = getIntersectionNode(headA, headB);
		if(common!=null)
			System.out.println(common.val);
		else
			System.out.println("common is null");
	}

	//13.65%
	public static ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		
		if(headA!=null && headB!=null){
			ListNode n1 = headA;
			ListNode n2 = headB;			
			int i1=0, i2=0;
			
			while(n1!=null || n2!=null){
				if(n1 == n2){
					return n1;
				}
				if(n1!=null){
					i1++;
					n1=n1.next;
				}
				if(n2!=null){
					i2++;
					n2=n2.next;
				}
			}
			
			n1 = headA;
			n2 = headB;
			
			if(i1>i2){				
				for(int i=0;i<(i1-i2);i++){
					n1=n1.next;
				}
			}
			else if(i2>i1){
				for(int i=0;i<(i2-i1);i++){
					n2=n2.next;
				}
			}
			
			while(n1!=n2){
				n1 = n1.next;
				n2 = n2.next;
			}
			return n1;
		}
		
		return null;
	}
}
