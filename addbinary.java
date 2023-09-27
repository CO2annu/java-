public class addbinary
{
	public static void main(String[] args)
	{
		int x[] = {1 , 0 , 0 , 1 , 0};
		int y[] = {1 , 1 , 0 , 1 , 0};
		int z[] = new int[6] ;
		int carry = 0;
		for(int i=4;i>=0;i--)
		{
			z[i+1] = (x[i] + y[i] + carry)%2;
			carry = (x[i] + y[i] + carry)/2;
		}
		z[0] = carry;
		for(int j=0;j<x.length+1;j++)
		{
			System.out.print(z[j]);
		}
		
	}
}