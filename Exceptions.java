//Question 5
import java.util.*;
class ScoreExcep extends Exception
{
	ScoreExcep(String a)
	{
		super(a);
	}
}
class Exceptions
{
	public static void main(String[] args) 
	{
		Scanner s=new Scanner(System.in);
		
		float r=0;
		int a=0;
		while(s.hasNext())
		{
			String abc=s.next();
		try
		{
          r=Float.parseFloat(abc);
          a=(int)r;
		}
		catch (Exception e)
		{
			System.out.println("Do you want to enter new score?");
			String w=s.next();
			if(w.equalsIgnoreCase("y")||w.equalsIgnoreCase("yes"))
			{
				continue;
			}
			else
				break;
		}
		try
		{
			if(a<0||a>100)
				throw new ScoreExcep("Do you want to enter new score?");
			else
				{System.out.println("Valid Number");
                  break;
              }
		}
		catch(Exception e)
		{
			System.out.println("Do you want to enter new score?");
			String w=s.next();
			if(w.equalsIgnoreCase("y")||w.equalsIgnoreCase("yes"))
			{
				continue;
			}
			else
				break;
		}
	}
	}
}