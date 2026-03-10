package bitManipulation;

public class Cheack_ith_bit {
	public static boolean checkset(int n,int i) {
		return (n&i<<1)!=0;   //1101&100=0100
	}

	public static void main(String[] args) {
		int n=13;
		int i=2;
		if(checkset(n,i)) {
			System.out.print(" set");
		}else {
			System.out.print("not set");
		}

	}

}
