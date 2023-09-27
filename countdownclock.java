public class countdownclock extends Thread
{
	public void run()
	{
		for(int t=20;t>=0;t--)
		{
			System.out.println("t minus " +t);
			try
			{
				Thread.sleep(1000);
			}
			catch( InterruptedException e)
			{}
		}
	}
}