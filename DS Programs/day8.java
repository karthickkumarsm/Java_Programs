/**
 * day8
 */
import java.util.*;
public class day8 {
 public static void main(String[] args) {
    int arr[]={8,4,1,9,6,2};
    for (int i = 0; i < arr.length; i++) {
        int big=Integer.MAX_VALUE;
        for (int j = 0; j < arr.length; j++) {
            if (arr[i]<arr[j]) {
                if(arr[j]<big){
                    big=arr[j];
                }
            }
        }
        if(big!=Integer.MAX_VALUE){
            System.err.print(arr[i]+"->"+big+",");
        }else{
            System.out.print(arr[i]+"-> ,");
        }
    }
 }
    
}

//from a given array of intgers print the next bigger number for each number in the array