package LinkedList;


public class Search {
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
	
	public static int length(Node head,int k) {
		Node temp=head;
		while(temp!=null) {
			if(temp.data==k) return 1;
			temp=temp.next;
		}
		return 0;
	}

	public static void main(String[] args) {
        int[] arr= {1,2,4,5};
		
		//traverse
		Node head=convertArraytoLL(arr);
		System.out.print(length(head,15));
		


	}

}
