package leetcode.easy;

public class AddTwoNumbers {

	public static void main(String[] args) {
		ListNode l1 = new ListNode(2);
		l1.next=new ListNode(4);
		l1.next.next = new ListNode(3);
		
		ListNode l2 = new ListNode(5);
		l2.next=new ListNode(6);
		l2.next.next = new ListNode(4);
		
		ListNode head = addTwoNumbers(l1, l2);
		printList(head);
	}

	public static void printList(ListNode head){
		while(head!=null){
			System.out.println(head.val);
			head=head.next;
		}
	}
	
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

		ListNode l3 = null, head=null;
		int sum=0,carry=0;
		
		while(l1!=null || l2!=null){
			if(l1!=null){
				sum+=l1.val;
				l1=l1.next;
			}
			if(l2!=null){
				sum+=l2.val;
				l2=l2.next;
			}
			sum+=carry;
			if(sum>9){
				carry = sum/10;
				sum = sum%10;
			}
			
			if(head ==null)
			{
				head = new ListNode(sum);
				l3 = head;
			}
			else{
				l3.next = new ListNode(sum);
				l3 = l3.next;
			}
			sum=0;
		}
		
		return head;		
	}
}

class ListNode{
	int val;
	ListNode next;
	ListNode(int x){val=x;}
}
