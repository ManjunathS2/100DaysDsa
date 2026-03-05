package LinkedList;

class Node {
	int data;
	Node next;
	
	Node(int data1,Node next1){
		data=data1;
		next=next1;
	}
	
	//if only data
	Node(int data1){
		data=data1;
		next=null;			
	}
}



public class ArrayToLL {
	public static Node ConvertArraytoLL(int[] arr) {
		Node head=new Node(arr[0]);
		Node mover=head;//duplicatte of head never tamper head
		for(int i=1;i<arr.length;i++) {
			Node temp=new Node(arr[i]);
			mover.next=temp;
			mover=temp;	
		}
		
		return head;
		
	}

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		Node head=ConvertArraytoLL(arr);
		System.out.print(head.data);
		System.out.print(head);
		

	}

}
