import java.util.Scanner;
public class arthematic
{
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args)
	{
		int NOM;
		int NOC;
		int MPC;
		int ML;
		System.out.println("enter the number of marbles");
		NOM=sc.nextInt();
		System.out.println("enter the number of childerns");
		NOC=sc.nextInt();
		MPC=NOM/NOC;
		ML=NOM%NOC;
		System.out.println("give each children"+MPC+"marbles");
		System.out.println("marbles left="+ML);
	}
}