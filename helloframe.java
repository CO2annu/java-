import javax.swing.*;
public class helloframe extends JFrame
{
	public static void main(String[] args)
	{
		 new helloframe();
	}
	public helloframe()
	{
		this.setSize(500,500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("HELLO WORLD!");
		this.setVisible(true);
		this.setLocation(500,500);
	}
}