//Question 4
import java.util.*;
class Employee
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		String ar[]=new String[n];
		for(int i=0;i<n;i++)
			ar[i]=s.next();
		String v=s.next();
		try
		{
			for(int i=0;i<n;i++)
			{
				if(v.equals(ar[i]))
					{System.out.println("found");
				break;}
				else
                 throw new Exception("not found");
			}
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
	}
}