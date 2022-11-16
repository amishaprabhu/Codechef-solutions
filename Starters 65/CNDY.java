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
	        int N=s.nextInt();
	        int A[]=new int[2*N];
	        HashMap<Integer,Integer> h=new HashMap<>();
	        for(int i=0;i<2*N;i++)
	        {
	            A[i]=s.nextInt();
	            if(h.containsKey(A[i]))
	            {
	                int q=h.get(A[i]);
	                h.put(A[i],++q);
	            }
	            else
	            {
	                h.put(A[i],1);
	            }
	        }
	        int maxValueInMap = (Collections.max(h.values()));
	        if(maxValueInMap>2)
	        {
	            System.out.println("No");
	        }
	        else
	        {
	            System.out.println("Yes");
	        }
	        T--;
	    }
	}
}