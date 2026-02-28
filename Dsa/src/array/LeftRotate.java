package array;

public class LeftRotate {
	public static void leftRotate(int[] arr) {
		//place first element in temp 
		int temp=arr[0];
		//loop from second element
		for(int i=1;i<arr.length;i++) {
			arr[i-1]=arr[i];
		}
		//place first to last position 
		arr[arr.length-1]=temp;
	}

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		LeftRotate.leftRotate(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}
