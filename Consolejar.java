package Documents.prog.java.learn;
import java.util.Scanner;
public  class Consolejar
{
	static Scanner sc=new Scanner(System.in);
	public static boolean askYorN(String prompt)
	{
		while(true)
		{
			String answer;
			System.out.println("\n" +prompt+"Y or N");
			answer=sc.next();
			if(answer.equals("Y"))
				return true;
			if(answer.equals("N"))
				return false;
		}
	}
}