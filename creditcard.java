public class creditcard
{
	private String number;
	private String name;
	private String bank;
	private double balance;
	private int limit;
	creditcard(String no,String nm,String bk,double bal,int lim)
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
	public String getName()
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
		if(price+balance>(double) limit)
			return false;
		balance = balance + price;
        return true;		
	}
	public void makePayment(double payment)
	{
		balance = balance - payment + payment*20/100;
	}
	public static void printCard(creditcard c)
	{
		System.out.println("Number="+ c.getNumber());
		System.out.println("Name=" +c.getName());
		System.out.println("Bank="+c.getBank());
		System.out.println("Balance="+c.getBalance());
		System.out.println("Limit="+c.getLimit());
		
	}
}
