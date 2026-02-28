package array;

public class Largest {

	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5};
		//intialize first element to max
		int max=arr[0];
		//loop rest elements 
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max) {//if current element gretat than max
				max=arr[i];			
			}
		}
		System.out.print(max);

	}

}
