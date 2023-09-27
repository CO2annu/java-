import java.util.Scanner;
public class isOdd
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args)
	{
		int i;
		i=sc.nextInt();
		boolean a;
		a=check(i);
		System.out.println(a);
	}
	public  static boolean check(int i)
	{
		if((i&1)==0)
			return false;
		else
			return true;
	}
}