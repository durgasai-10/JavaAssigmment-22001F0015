/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner input = new Scanner(System.in);
		int T = input.nextInt();
		while(T>0)
		{
		    int even=0,odd=0;
		    int N=input.nextInt();
		    int A= input.nextInt();
		    int B = input.nextInt();
		    for(int i = 1;i<=N;i++)
		    {
		        if(i%2==0)
		        {
		            even++;
		        }
		        else
		        {
		            odd++;
		        }
		    }
		    System.out.println((A*even) + (B*odd));
		}
	}
}