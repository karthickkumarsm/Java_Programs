import java.util.Scanner;

public class day13 {
    public static void printPattern(String s){
        if(s.length()%2==0){
            System.out.println("Please give me a odd number length string");
        }
        else{
            for(int i=0;i<s.length();i++){
                for(int j=0;j<s.length();j++){
                    if (i==j || i+j==s.length()-1) {
                        System.out.print(s.charAt(i));
                    }
                    else{
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String s1=s.nextLine();
        s.close();
        printPattern(s1);
    }
}
