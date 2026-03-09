package LinkedList;


public class InsertNode {
	
	public static void traverse(Node head) {
		Node temp=head;
		while(temp!=null) {
			System.out.println(temp.data);
			temp=temp.next;
		}
		
	}
	public static Node insertAtFront(Node head) {
		Node temp=new Node(10,head);
		return temp;
	}
	public static Node insertAtEnd(Node head) {
		Node temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		Node newnode=new Node(20,null);
		temp.next=newnode;
		
		return temp;
	}

	public static void main(String[] args) {
		int[] arr= {1,2,3,5};
		Node head=new Node(arr[0]);
		Node mover=head;
		for(int i=1;i<arr.length;i++) {
			Node temp=new Node(arr[i]);
			mover.next=temp;
			mover=temp;
		}
		head=InsertNode.insertAtFront(head);
		insertAtEnd(head);
		traverse(head);
	}

}
