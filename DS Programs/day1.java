import java.util.*;
import java.util.Scanner;
public class day1{
    public static void main(String args[]){
        int a[]={0,5,6,0,9,0,0,1};
        int sum,big=0;

        for(int i=0;i<a.length-1;i++){
           sum= a[i]+a[i+1];
           if(sum>big){
            big=sum;
           }
        }
        System.out.println(big);
    }
}

//biggest number