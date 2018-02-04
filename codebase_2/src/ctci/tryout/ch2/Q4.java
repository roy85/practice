package ctci.tryout.ch2;

public class Q4 {

	public static void main(String[] args) {
		Node head = new Node(1);
		head.next=new Node(2);
		head.next.next=new Node(1);
		head.next.next.next=new Node(1);
		
		System.out.println("before");
		printLL(head);
		System.out.println("after");
		Node h = partitionLL(head, 2);
		printLL(h);
	}

	private static void printLL(Node head2) {
		while(head2!=null){
			System.out.println(head2.val);
			head2=head2.next;
		}
	}
	
	public static Node partitionLL(Node head, int val){
		if(head==null)
			return null;
		
		Node p1=null, next=null,head2=head;
		
		while(head!=null){
			if(head.val<val){
				next = head.next;
				head.next=null;
				if(p1==null){
					p1=head;
				}
				else{
					p1.next=head;
					p1=p1.next;
				}
				
				head = next;
			}
			else{
				head=head.next;
			}
		}
		
		if(p1==null)
			return head2;
		else{
			p1.next=head2;
			return p1;
		}
	}
	
}
