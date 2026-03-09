package LinkedList;

public class Traverse {
	
	public static Node convertArraytoLL(int[] arr) {
		Node head=new Node(arr[0]);
		Node mover=head;
		for(int i=1;i<arr.length;i++) {
			Node temp=new Node(arr[i]);
			mover.next=temp;//creating link
			mover=temp;
		}
		return head;
		
	}

	public static void main(String[] args) {
		int[] arr= {1,2,4,5};
		
		//traverse
		Node head=convertArraytoLL(arr);
		Node temp=head;
		while(temp!=null) {
			System.out.print(temp.data);
			temp=temp.next;
		}

	}

}
