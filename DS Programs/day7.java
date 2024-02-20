import java.util.*;
public class day7 {
    public static void main(String[] args) {
        int arr[]={50,30,20,70,60,10,40};
        Arrays.sort(arr);
        for (int i = 1; i < arr.length; i+=2) {
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
//given an array of integers,rearrange the array such that every second element of the arrayy is greater than its left and right elements
//Assume no duplicate elements are present in the array