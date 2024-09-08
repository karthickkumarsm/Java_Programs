import java.util.*;

public class day27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        char[] ch = s.toCharArray();
        int count=0;
        char c = sc.next().charAt(0);
        for(int i=0;i<n;i++){
            if(ch[i]==c){
                count++;
            }
        }
        System.out.println(count);
       sc.close(); 
    }
}

//accenture problem 1 : Character count