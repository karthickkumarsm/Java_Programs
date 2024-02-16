import java.util.Scanner;
public class day3 {
      public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        int arr[]=new int[26];
        for(int i=0;i<str.length();i++){
         arr[str.charAt(i)-'a']++;
        }
        for(int i=0;i<str.length();i++){
            if(arr[str.charAt(i)-'a']>0)
            System.err.print(str.charAt(i)+""+arr[str.charAt(i)-'a']);
            arr[str.charAt(i)-'a']=0;
        }
      }
}
