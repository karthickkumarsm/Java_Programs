import java.util.*;

public class day30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]=sc.nextInt();
        }
        int sum=0;
        int xor=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==1){
                sum+=arr[i];
            }
            else{
                xor^=arr[i];
            }
        }
        System.out.println(xor-sum);
    }
}

//accneture 4th sum : Sum XOR