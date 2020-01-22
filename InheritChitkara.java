import java.util.*;
class Institute
{
	String name;

	void print()
	{
		System.out.println(name);
	}
}
class Chitkara extends Institute
{
	
	int n;
	Chitkara(String n,int a)
	{
		name=n;
		this.n=a;
	}
	void print()
	{
		
		System.out.println(n);
		System.out.println(name);
	}

}

class InheritChitkara
{
	public static void public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String name=s.next();
		int num=s.nextInt();
		Chitkara i=new Chitkara(name,num);
		i.print();
		


	}

}
