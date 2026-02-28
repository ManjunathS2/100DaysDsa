package Maths;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=121;
		int temp=n;
		int reversed=0;
		while(temp>0) {
			int lastdigit=temp%10;
			reversed=reversed*10+lastdigit;
			temp=temp/10;
		}
		if(n==reversed) {
			System.out.print("palindrome");
		}else {
			System.out.print("not palindorme");
		}
		
	}

}
