 import java.util.*;
import java.lang.*;
import java.io.*;
public class day19 {
        public static void main (String[] args) throws java.lang.Exception
        {
            // your code goes here
            Scanner sc=new Scanner(System.in);
            int t=sc.nextInt();
            while(t-- > 0){
                int count=0;
                int a=sc.nextInt();
                int b=sc.nextInt();
                if(a==b) System.out.println(1);
                else{
                    int res=2*b-2*a;
                    System.out.println(res+1);
                }
            }
        }
}
