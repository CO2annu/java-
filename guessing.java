import java.util.Scanner;
public class GuessingGame
{
	Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		int a;
		
		System.out.println("let's play a Guessing Game!");
		System.out.println("I'm thinking of a number between 1 to 10");
		System.out.println("What do you think it is?");
		int b=sc.nextInt();
		while(true)
		{
			a=game(1,10);
			if(x==a)
			{
				System.out.println("yes you are correct");
				System.out.println("play again?");
				String answer=sc.nest();
				if(answer=Y)
				{
					continue;
				}
				else break;
			}
				
			
		}
	}
	
	public static int game(int x ,int y)
	{
		int randonInt= (int)(Math.random()*(y-x+1)) + x;
		return randonInt;
	}
	
}
