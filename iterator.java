import java.util.*;
class iterator
{
	public static void main(String[] args)
	{
		ArrayList<String> nums = new ArrayList<String>();
		nums.add("one");
		nums.add("two");
		nums.add("three");
		nums.add("four");
		String s;
		Iterator e = nums.iterator();
		while(e.hasNext())
		{
			s = (String)e.next();
			System.out.println(s);
		}
	}
}