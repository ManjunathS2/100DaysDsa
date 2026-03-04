package strings;
import java.util.*;

public class CheckAnagram {

	public static void main(String[] args) {
		String str1="integer";
		String str2="tegernt";
		
		if(str1.length()!=str2.length()){
			System.out.print("not anagram");
			return ;
		}
		
		char[] charArray1=str1.toCharArray();
		char[] charArray2=str2.toCharArray();
		Arrays.sort(charArray2);
		Arrays.sort(charArray1);
		
		for(int i=0;i<str1.length();i++) {
			if(charArray1[i]!=charArray2[i]) {
				System.out.print("not anagram");
				return ;
			}
		}
		System.out.print("anagram");
		
		

	}

}
