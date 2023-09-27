public class dice
{
	public static void main(String[] args)
	{
		int roll;
		String msg="here are the 100 random rolls of the dice:";
		System.out.println(msg);
		for(int i=0;i<100;i++)
		{
			roll=randomInt(1,6);
			System.out.println(roll+"");
		}
		System.out.println();
	}
	public static int randomInt(int low,int high)
	{
		int result=(int)(Math.random()*(high-low+1)) +low;
		return result;
	}
	
}