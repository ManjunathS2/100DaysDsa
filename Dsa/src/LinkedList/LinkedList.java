package LinkedList;

//self defined structure
class Node{
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

public class LinkedList {

	public static void main(String[] args) {
		//initialize node
		Node y=new Node(10);
		System.out.print(y.data+" ");
		System.out.print(y);

	}

}
