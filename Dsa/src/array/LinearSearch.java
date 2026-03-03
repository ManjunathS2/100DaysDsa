package array;

public class LinearSearch {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int key = 10;

        int index = -1;  // assume not found

        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == key) {
                index = i;
                break;
            }
        }

        if(index == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at index: " + index);
        }
    }
}