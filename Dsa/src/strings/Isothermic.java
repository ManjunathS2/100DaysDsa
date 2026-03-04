package strings;

public class Isothermic {
	public static boolean isothermic(String str1,String str2) {
		int[] m1=new int[256];
		int[] m2= new int[256];
		
		if(str1.length()!=str2.length()) {
			return false;
		}
		
		for(int i=0;i<str1.length();i++) {
			if(m1[str1.charAt(i)]!=m2[str2.charAt(i)]) {
				return false;
			}
			m1[str1.charAt(i)]=i+1;
			m2[str2.charAt(i)]=i+1;
		}
		return true;	
	}

	public static void main(String[] args) {
		String s1="paper";
		String s2="title";
		if(Isothermic.isothermic(s1, s2)) {
			System.out.print("string is isomorpic");
		}
		else {
			System.out.print("string is not isomorpic");
		}

	}
}
