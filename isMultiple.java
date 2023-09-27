import java.util.Scanner;
public class isMultiple
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args)
	{
		long m,n;
		//boolean a;
		m=sc.nextLong();
		n=sc.nextLong();
		//a=check(m,n);
		System.out.println(n%m==0);
	}
	/*public static boolean check(long m, long n)
		{
		if(n%m==0)
		{
			return true;
		}
		else 
		{
			return false;
		}
        }*/
}