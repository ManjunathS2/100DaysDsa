package array;

public class SecondSmallAndLarge {
	public static int secondSmall(int[] arr) {
		int small =Integer.MAX_VALUE;
		int second_small=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]<small) {
				second_small=small;
				small=arr[i];
			}else if(arr[i]<second_small&&arr[i]!=small) {
				second_small=arr[i];
			}
		}
		return second_small;
		
	}
	
	public static int secondLarge(int[] arr) {
		int large=Integer.MIN_VALUE;
		int second_large=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>large) {
				second_large=large;
				large=arr[i];
			}else if(arr[i]>large&&arr[i]!=0) {
				second_large=arr[i];
			}
		}
		return second_large;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5};
		System.out.print(secondSmall(arr));
		System.out.print(secondLarge(arr));
		

	}

}
