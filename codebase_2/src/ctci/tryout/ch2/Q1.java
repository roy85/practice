package ctci.tryout.ch2;

public class Q1 {

	public static void main(String[] args) {

		Node head = new Node(1);
		head.next=new Node(2);
		head.next.next=new Node(1);
		head.next.next.next=new Node(1);
		
		System.out.println("before");
		printLL(head);
		
		Node head2 = removeDupe(head);
		if(head2==null)
			System.out.println("returned head is null");
		else
			{
				System.out.println("after");
				printLL(head2);
			}
		
	}

	
	
	private static void printLL(Node head2) {
		while(head2!=null){
			System.out.println(head2.val);
			head2=head2.next;
		}
	}



	public static Node removeDupe(Node head){
		if(head == null || head.next==null){
			return head;
		}
		
		Node slow=head, fast=head,prev=head;
		
		while(slow!=null){
			fast = slow.next;
			
			while(fast !=null){
				if(fast.val==slow.val){
					prev.next=fast.next;					
				}
				else{
					prev = prev.next;
				}
				fast = fast.next;
			}
			slow = slow.next;
		}
		
		return head;
	}
	
}

class Node{
	int val;
	Node next;
	public Node(int val){
		this.val = val;
	}
}