package array;

public class RemoveDuplicate {
	public static int removeDuplicate(int[] arr) {
		int i=0;
		for(int j=1;j<arr.length;j++) {
			if(arr[j]!=arr[i]) {
				i++;
				arr[i]=arr[j];
			}
		}
		return i+1;
	}

	public static void main(String[] args) {
		
		int[] arr= {1,1,2,3,4,5,6,6};
		int newsize=RemoveDuplicate.removeDuplicate(arr);
		for(int x=0;x<newsize;x++) {
			System.out.print(arr[x]+" ");
		}

	}

}
