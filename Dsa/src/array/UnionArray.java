package array;
import java.util.*;

public class UnionArray {

    public static void main(String[] args) {

        List<Integer> union=new ArrayList<>();
        
        int[] arr1= {1,2,3};
        int[] arr2= {2,3,4};
        
        int n=arr1.length;
        int m=arr2.length;
        
        int i=0;
        int j=0;
        
       while(i<n&&j<m) {
    	   if(arr1[i]<arr2[j]) {
    		   if(union.isEmpty()||union.get(union.size()-1)!=arr1[i]) {
    			   union.add(arr1[i]);
    		   }
    		   i++;
    	   }
    	   
    	   else if(arr2[j]<arr1[i]) {
    		   if(union.isEmpty()||union.get(union.size()-1)!=arr2[j]) {
    			   union.add(arr2[j]);
    		   }
    		   j++;
    	   }
    	   
    	   else {
    		   if(union.isEmpty()||union.get(union.size()-1)!=arr1[i]) {
    			   union.add(arr1[i]);
    		   }
    		   i++;
    		   j++;
    	   }
    	   
       }
       
       while(i<n) {
    	
    		   if(union.isEmpty()||union.get(union.size()-1)!=arr1[i]) {
    			   union.add(arr1[i]);
    		   }
    		   i++;
    	   
       }
        
       while(j<m) {
    	   if(union.isEmpty()||union.get(union.size()-1)!=arr2[j]) {
			   union.add(arr2[j]);
		   }
		   j++;
       }
       
       System.out.print(union);
        
    }
}
