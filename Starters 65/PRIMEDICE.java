/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	     Scanner s=new Scanner(System.in);
	    int T=s.nextInt();
	    while(T!=0)
	    {
	        int A=s.nextInt();
	        int B=s.nextInt();
	        int p=A+B;
	        int flag=0;
	        for(int i=2;i<=p/2;i++)
	        {
	            if(p%i==0)
	            {
	                flag=1;
	                break;
	                //System.out.println("Bob");
	            }
	            else
	            {
	                flag=0;
	                //System.out.println("Alice");
	            }
	        }
	        if(flag==0)
	        {
	            System.out.println("Alice");
	        }
	        else
	        {
	            System.out.println("Bob");
	        }
	        T--;
	    }
		// your code goes here
	}
}
