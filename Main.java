import java.util.*;
class Employee
{

	int id;
	String name;
	String designation;
	int salary;
	Scanner s=new Scanner(System.in);
	public void getData()
	{
		id=s.nextInt();
		name=s.next();
		designation= s.next();
	}
	// public abstract void getSalary();


}
 class Fixed extends Employee
{
	 
	 public void getSalary()
	 {
	 	salary=700;
	 	System.out.println("The salary of the member, "+name+" is "+salary);
	 }
	


}
 class Hourly extends Employee
{
	
	
	 public void getSalary()
	 {
	 	int hrs=s.nextInt();
	 salary=200*hrs;
	 	System.out.println("The salary of the member, "+name+" is "+salary);
	 }
	

}
 class Margin extends Employee
{
	
	
	 public void getSalary()
	 {
	 	int sales=s.nextInt();
	 salary=100*sales;
	 	System.out.println("The salary of the member, "+name+" is "+salary);
	 }
	


}
 class Base extends Employee
{
	
	
	 public void getSalary()
	 {
	 	int sales=s.nextInt();
	 salary=700+100*sales;
	 	System.out.println("The salary of the member, "+name+" is "+salary);
	 }
	


}
class Main
{
	 public static void main(String[] args) {
	 	Employee obj= new Employee();
	 	obj.getData();
	 	int choice;
	 	System.out.println("Choose your type of Salary:");
	 	System.out.println("Choose 1 for Fixed salary\nChoose 2 for Hourly wages\nChoose 3 to get margin in sales\nChoose 4 to get base salary");
	 	Scanner s=new Scanner(System.in);
	 	choice=s.nextInt();
	 	if(choice==1)
	 	{
	 		Fixed f=new Fixed();
	 		f.getSalary();
	 	}
	 	else  if(choice==2)
	 	{
	 		Hourly h=new Hourly();
	 		h.getSalary();
	 	}
	 	else if(choice==3)
	 	{
	 		Margin m=new Margin();
	 		m.getSalary();
	 	}
	 	else if(choice==4)
	 	{
	 		Base b=new Base();
	 		b.getSalary();
	 	}
	 	else
	 		System.out.println("Wrong input");

		

	}
}
