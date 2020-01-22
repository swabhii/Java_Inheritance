import java.util.*;
class Doctor
{
	int age;
	String name;
	String address;
	private int id;
	int salary;
	Doctor(String n,int a, int i)
	{
		name=n;
		age=a;
		id=i;
	}
	void print()
	{
		System.out.println(name);
		System.out.println(salary);
		System.out.println(age);
		System.out.println(id);
	}
}
class Dentist extends Doctor
{
	int patients()
	{
		return 0;
	}

}
class Surgeon extends Doctor
{
	int patients()
	{
		return 0;
	}
}
class PrivateDoctor
{
	public static void public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
	}

}
