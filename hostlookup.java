import java.util.Scanner; 
import java.net.*;
public class hostlookup
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.println("welcome");
		String host;
		do
		{
			host = sc.next();
			try
			{
				InetAddress[] addresses = InetAddress.getAllByName(host);
				for(InetAddress ip : addresses)
					System.out.println(ip.toString());
			}
			catch (UnknownHostException e)
			{
				System.out.println("not a host");
			}
			
		}
		while(doAgain());
	}
	public static boolean doAgain()
	{
		String s;
		while(true)
		{
			System.out.println("countinue?");
			s = sc.next();
			if(s.equalsIgnoreCase("Y"))
				return true;
			else if(s.equalsIgnoreCase("N"))
				return false;
		}
	}	
}