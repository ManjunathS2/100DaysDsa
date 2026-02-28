package Maths;

public class armstrong {
	

	public static void main(String[] args) {
		int number=1534;
		int temp=number;
		int sum=0;
		
		int count=0;
		while(temp>0) {
			count++;
			temp=temp/10;	
		}
	
		temp=number;
		
		while(temp>0) {
			int last=temp%10;
			sum+=Math.pow(last,count);
			temp=temp/10;
		}
		System.out.print(sum);
		if(sum==number) {
			System.out.print("armstrong");
		}else {
			System.out.print("not armstrong");
		}
		
	}

}
