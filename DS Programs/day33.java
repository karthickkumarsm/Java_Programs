import java.util.Scanner;

public class day33 {
    	public static void main(String[] args){
		//write your code here
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int E = sc.nextInt();
		int D = sc.nextInt();
		int total = E*D;
		int sunday = D/7;
		int purchase = D-sunday;
		if(purchase*N < total){
		    System.out.println(-1);
		}
		else{
		    System.out.println((int)Math.ceil((double)total/N));
		}
	}
}
