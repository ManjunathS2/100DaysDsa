package Maths;

public class CountDigits {

	public static void main(String[] args) {
		int n=120489;
		int count=0;
		while(n>0) {
			count++;
			n=n/10;//remove last digit
		}
		System.out.print(count);
	}

}
