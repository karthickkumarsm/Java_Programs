import java.util.*;

public class day29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        String[] a = new String[n];
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                a[i]="Even";
            }
            else{
                a[i]="Odd";
            }
            System.out.print(a[i]+" ");
        }
    }
}

//accenture 3rd sum : Even Odd