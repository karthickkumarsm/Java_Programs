import java.util.*;

public class day28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int v = sc.nextInt();
        int vn = sc.nextInt();
        int e = v/vn;
        int en = (int)Math.pow(e, 2);
        System.out.println(h*en);
    }
}

//accenture 2nd sum : final height