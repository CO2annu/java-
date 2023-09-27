public class countdownapp
{
	public static void main(String[] args)
	{
		Thread m = new countdownclock();
		Runnable flood, ignition, liftoff;
			flood = new launchEvent(16, "Flood the pad!"); 
			ignition = new launchEvent(6, "Start engines!");
			liftoff = new launchEvent(0, "Liftoff!");
		m.start();
			new Thread(flood).start();
			new Thread(ignition).start();
			new Thread(liftoff).start();
	}
}