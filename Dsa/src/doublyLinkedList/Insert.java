package doublyLinkedList;

class Node{
	int data;
	Node next;
	Node back;
	
	Node(int data1,Node next1,Node back1){
		data=data1;
		next=next1;
		back=back1;
	}
	Node(int data1){
		data=data1;
		next=null;
		back=null;
	}
}



public class Insert {
	
	public static void print(Node head) {
		while (head!=null) {
			System.out.println(head.data);
			head=head.next;
		}
	}
	
	public static Node  insertBeforehead(int data,Node head) {
		Node temp=new Node(data,head,null);
		head.back=temp;
		return temp;
	}
	
	public static Node insertBeforeTail(int data,Node head) {
		Node newnode=new Node(data);
		Node temp=head;
		Node prev=null;
		while(temp.next!=null) {
			temp=temp.next;
		}
		prev=temp.back;
		newnode.next=temp;
		prev.next=newnode;
		newnode.back=prev;
		temp.back=newnode;
		
		return head;
	}

	public static void main(String[] args) {
		int[] arr= {1,2,3,4};
		Node head=new Node(arr[0]);
		Node prev=head;
		for(int i=1;i<arr.length;i++) {
			Node temp=new Node(arr[i],null,prev);
			prev.next=temp;
			prev=temp;
		}
		head=insertBeforehead(10,head);
		insertBeforeTail(19,head);
		print(head);
		

	}

}
