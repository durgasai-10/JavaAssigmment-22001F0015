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
for(int i=1;i<=T;i++)
{
    int N=input.nextInt();
    int X=input.nextInt();
    int Y=input.nextInt();
    if(Y%X==0)
    {
        System.out.println("YES");
    }
        else
        {
            System.out.println("NO");
        }
    
}
	}
}
