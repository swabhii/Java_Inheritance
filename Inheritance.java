//Question 4
import java.util.*;
class One
{
	void a()
	{
		System.out.println("Class 1");
	}
}
class Two extends One
{
	void a()
	{
		System.out.println("Class 2 -a");//Overriding implemented here
	}
	void b()
	{
		System.out.println("Class 2 - b1");
	}
	void b(int n)
	{
        System.out.println("Class 2-b2");//Overloading, parameterised 
	}
}
class Inheritance
{
	public static void main(String[] args) 
	{
		Two b1=new Two();
        b1.a();
        b1.b();
        b1.b(5);
	}
}