package bitManipulation;

public class Power {
	public static boolean powerOrNot(int n) {
		//every power of 2 will have one set bit
		return n>0 && (n&(n-1))==0; //n&n-1 remove last set bit 
	}

	public static void main(String[] args) {
		int n=10;
		if(powerOrNot(n)) {
			System.out.print("power");
		}else {
			System.out.print(" Not power");
		}

	}

}
