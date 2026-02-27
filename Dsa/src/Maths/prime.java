package dsa;

public class prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=30;
		int count=0;
		for(int i=2;i*i<=n;i++) {
			if(n%i==0) {
				count++;
				if(n/i!=i) {
					count++;
				}
			}
			
		}
		if(count==0) {
			System.out.print("prime");
		}else {
			System.out.print("not prime");
		}	

	}

}
