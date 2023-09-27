public class Clone 
{
	public  static void main(String[] args)
	{
	    Employee emp1=new Employee("Martinez","Anthony");
	    emp1.setSalary(40000.0);
	    Employee emp2=(Employee)emp1.clone();
	    emp1.setLastName("smith");
	    System.out.println(emp1);
	    System.out.println(emp2);
	}
}
class Employee
{
	private String lastName;
	private String firstName;
	private Double Salary;
	public Employee(String lastName,String firstName)
	{
		this.lastName=lastName;
		this.firstName=firstName;
	}
	public void setLastName(String lastName)
	{
		this.lastName=lastName;
	}
	public String getFirstName()
	{
		return this.firstName;
	}
	public void setFirstName(String firstName)
	{
		this.firstName=firstName;
	}
	public Double getSalary()
	{
		return this.Salary;
	}
	public void setSalary(Double Salary)
	{
		this.Salary=Salary;
	}
	public Object clone()
	{
		Employee emp;
		emp=new Employee(this.lastName,this.firstName);
		emp.setSalary(this.Salary);
		return emp;
	}
    public String toString()
	{
		return this.getClass().getName() + "[" +this.firstName + "," +this.lastName+ "," +this.Salary + "]";
    }
}