import java.util.Scanner;
public class guessgame2
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{   do
		  {
	       playAround();
		  }
		   while (askForAnotherRound());
		  
	System.out.println("thanks for playing");
	}
	public static void playAround()
	{
		int number,guess;
		boolean validInput;
		String answer;
		number=getrandomNumber();
		System.out.println("i'm guessing a number between 1 to 10");
		guess=getguessnumber();
		if(guess==number)
			System.out.println("you are right");
		else 
			System.out.println("you are wrong!" + "the number was "+number);
	}
	public static int getguessnumber()
	{
		while(true)
		{
		  int guess = sc.nextInt();
		  if(guess<0 || guess>10)
			  System.out.println("i said between 1 to 10");
		  else 
			  return guess;
		} 
	}
	public static int getrandomNumber()
	{
		return (int)(Math.random()*10) +1;
	}
	
	public static boolean askForAnotherRound()
	{
		while(true)
		{
			String answer;
			System.out.println("play agaim?(Y or N)");
			answer=sc.next();
			if(answer.equals("Y"))
			return true;
		    else if(answer.equals("N"))
				return false;
		}
	}
}
