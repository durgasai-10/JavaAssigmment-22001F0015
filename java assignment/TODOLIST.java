/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner input=new Scanner(System.in);
		int T=input.nextInt();
		for(int i=0;i<T;i++)
		{
		    int N=input.nextInt();
		    int array[]=new int[N];
		
		int count=0;
		for(int j=0;j<N;j++)
		{
		  array[j]=input.nextInt();
		  if(array[j]>=1000)
		  {
		      count++;
		  }
		    
		}
		System.out.println(count);
	}
}}
