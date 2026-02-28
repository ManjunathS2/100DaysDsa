package array;

public class IsSorted {
	public static boolean isSored(int[] arr) {
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<arr[i-1]) {
				return false;
			}
			
		}
		return true;
	}

	public static void main(String[] args) {
		int[] arr= {1,2,3,4};
		System.out.print(IsSorted.isSored(arr));

	}

}
