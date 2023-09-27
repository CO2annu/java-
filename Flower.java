import java.util.Scanner; 
public class flower
{
	 private static String name ;
	 private int petals;
	 private float price;
    flower(int i,String s,float f)
	{
		this.petals = i;
		this.name = s;
		this.price = f;
	}
	public  int getpetals()
	{
		return petals;
	}
	public static String getname()
	{
		return name;
	}
	public float getprice()
	{
		return price;
	}
	public static void main(String[] args)
	{
		flower s1 = new flower( 5,"Rahul", 5.97f);
		System.out.println(s1.getname());
	}
}  	