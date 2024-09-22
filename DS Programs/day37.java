import java.util.*;

public class day37 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] mat = new int[n][n];
        int temp[][] = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                mat[i][j]=sc.nextInt();
                temp[i][j]=mat[i][j];
            }
        }
        int k=0;
        for(int i=0;i<n;i++){
            for(int j=n-1;j>=0;j--){
                if(k<n){
                    temp[i][k]=mat[i][j];
                    k++;
                }
            }
            k=0;
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                mat[i][j]=temp[j][i];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat[i][j]);
            }
            System.out.println();
        }
    }
}

// rotate matrix by anti-clockwise 90 deg