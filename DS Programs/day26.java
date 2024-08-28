import java.util.Scanner;

public class day26 {
    public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            while(n-- > 0){
            int a = sc.nextInt();
		    int b = sc.nextInt();
		    int c = sc.nextInt();
	 
		    if (a<=b && a<=c)
		    System.out.println(b+c);
		    
		    else if (b<=c && b<=a)
		    System.out.println(c+a);
		    
		    else if (c<=a && c<=b)
		    System.out.println(a+b);
            }
	}
}
