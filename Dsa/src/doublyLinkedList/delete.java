package doublyLinkedList;

public class delete {
	public static void print(Node head) {
		while (head!=null) {
			System.out.println(head.data);
			head=head.next;
		}
	}
	
	public static Node deletehead(Node head) {
		if(head==null || head.next==null) {
			return null;
		}
		Node temp=head;
		head=head.next;
		head.back=null;
		temp.next=null;
		return head;
	}
	public static Node deleteTail(Node head) {
		 // If list is empty
        if (head == null) return null;

        // If only one node present
        if (head.next == null) return null;
        
        Node temp=head;
        while(temp.next!=null) {
        	temp=temp.next;
        }
        temp.back.next=null;
        
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
		
		head=deletehead(head);
		deleteTail(head);
		
		print(head);
		
	}

}
