public class CreditCard
{
	private String number;
	private String name;
	private String bank;
	private double balance;
	private int limit;
	CreditCard(String no,String nm,String bk,double bal,int lim)
	{
		number=no;
		name=nm;
		bank=bk;
		balance= bal; 
		limit=lim;
	}
	public String getNumber()
	{
		return number;
	}
	public String getname()
	{
		return name;
	}
	public String getBank()
	{
		return bank;
	}
	public double getBalance()
	{
		return balance;
	}
	public int getLimit()
	{
		return limit;
	}
	public boolean chargelt(double price)
	{
		if(price+balance=(double) limit)
			return false;
		balance = balance + price;
        return true;		
	}
	public void makePayment(double payment)
	{
		balance = balance - payment;
	}
	public static void main(CreditCard c)
	{
		system.out.println("Number"= c.getnumber());
	}
}
//public class test
//{
	//public static void main(String[] args)
	//{
	//	C
	//}
//}