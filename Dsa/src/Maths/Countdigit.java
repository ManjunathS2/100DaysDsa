package Maths;

public class Countdigit {

	public static void main(String[] args) {
		int n=1234;
		int count=0;
		while(n>0) {
			count++;
			n=n/10;			
		}
		System.out.print(count);

	}

}
