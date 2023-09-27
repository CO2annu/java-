import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args)
	{
		// your code goes here
			Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0)
		{
		    String s  = sc.next();
		     int flag=0;
		    for(int i=0;i<s.length();i++)
		    {
		        if(s.charAt(i)=='a' || s.charAt(i)=='e' ||
	                s.charAt(i)=='i' || s.charAt(i)=='o' ||
	                s.charAt(i)=='u')
	                flag++;
	           else
	           flag=0;
		    }
		    if(flag>2)
		    System.out.println("HAPPY");
		    else
		    System.out.println("SAD");
		}
	}
}

