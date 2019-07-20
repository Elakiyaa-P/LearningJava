/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class funmatrix {
	public static void main (String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		for(int i=0;i<=n-1;i++)
		{
		    for(int j=1;j<=n;j++)
		    {
		        int k=i+j-1;
		        if(k>n-1)
		        {
		            k-=n;
		        }
		        System.out.print(k);
		    }
		    System.out.println(" ");
		}
	}
}