import java.util.*;
import java.lang.*;
import java.io.*;

public class day36 {
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		for(int i=0;i<t;i++)
		{
		    int n=sc.nextInt();
		    int a[]=new int[n];
		    for(int k=0;k<n;k++)
		    a[k]=sc.nextInt();
		    Arrays.sort(a);
		    int max=1;
		    int count=1;
		    for(int u=1;u<n;u++)
		    {
		        if(a[u]==a[u-1])
		        {
		            count++;
		        }
		        else
		        {
		            count=1;
		        }
		        if(count>max)
		        {
		            max=count;
		        }
		    }
		    System.out.println(n-max);
		}
		
	}
}
