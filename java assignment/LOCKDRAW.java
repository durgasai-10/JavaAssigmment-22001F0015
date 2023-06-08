/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); 

        for (int i = 0; i < T; i++) {
            int A = scanner.nextInt();
            int B = scanner.nextInt();
            int C = scanner.nextInt();

            int total = A + B + C;

            if (total % 2 != 0) {
                System.out.println("NO");
            } else if (A == B && B == C) {
                System.out.println("YES");
            } else if (A == B || B == C || A == C) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}

	

