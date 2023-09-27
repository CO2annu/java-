import java.util.Scanner;
public class charat
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.println("Enter a String:");
		String s = sc.nextLine();
		int vovelCount =0;
		for(int i=0; i<s.length() ;i++)
		{  
			char c=s.charAt(i);
			if( c=='a'||  c=='e'||  c=='i'||  c=='o'||  c=='u'|| c=='A'||  c=='E'||  c=='I'||  c=='O'||  c=='U' )
				vovelCount++;
		}
		System.out.println("the number of vovels in entered string is" +vovelCount+"vovels");
	}
}