//Question 2
import java.util.*;
class Palindrome
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		while(num!=0)
		{
			int num1=num;
			int num2=num;
			int a=0;
			int r;
			int count=0;
			while(num1!=0)
			{
				num1=num1/10;
				count++;
			}
			if(count!=5)
			{
				System.out.println("Error!!");
				num=s.nextInt();
			}
			else
			{
				while(num2!=0)
				{
					r=num2%10;
					a=a*10+r;
					num2=num2/10;
				}
				if(a==num)
				{
					System.out.println("This is a Palindrome");
					num=0;
					break;
				}
				else
				{
					System.out.println("This is not palindrome");
					num=0;
					break;
				}
			}
		}
	}
}