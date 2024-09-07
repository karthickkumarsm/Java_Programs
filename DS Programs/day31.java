import java.util.*;

public class day31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int i1 = 0;
        int i2 = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(a[i] + a[j] == 18) {
                    if (i1 * i2 < a[i] * a[j]) {
                        i1 = a[i];
                        i2 = a[j];
                    }
                }
            }
        }
        if(i1 > i2) {
            System.out.print(Arrays.toString(new int[] {i1, i2}));
        } else {
            System.out.print(Arrays.toString(new int[] {i2, i1}));
        }
    }
}

// accenture 5th problem : Maximum Pair Product