package array;

public class Rotate {
	public static void reverse(int[] arr,int start,int end) {
		while(start<end) {
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
	}
	public static int[] rotate(int[] arr, int k, String direction)	{
		int n=arr.length;
		if(arr.length==0) return arr;
		k=k%n;
		if(direction.equals("right")) {
			reverse(arr,0,n-1);
			reverse(arr,0,k-1);
			reverse(arr,k,n-1);
		}else if(direction.equals("left")) {
			reverse(arr,0,k-1);
			reverse(arr,k,n-1);
			reverse(arr,0,n-1);
			
		}
		return arr;
		
	}

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5,6};
		int k=3;
		String directon="right";
		int[] result=rotate(arr,k,directon);
		
		   for (int nums : result) {
	            System.out.print(nums + " ");
	        
	    }
	}

}
