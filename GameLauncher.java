//Question 6
import java.util.*;
import java.util.Random;
class GuessGame
{
	Scanner s=new Scanner(System.in);
	String p1,p2,p3;
	int r1,r2,r3;
	String winner;
	
	void persons()
	{

		p1=s.next();
		p2=s.next();
		p3=s.next();
	}
	void numbers()
	{

		r1=s.nextInt();
		r2=s.nextInt();
		r3=s.nextInt();
	}
    String startGame(int x)
    {
    	while(winner==null)
    	{
    	if(r1==x||r2==x||r3==x)//verifying if the number match
    	{
    		if(r1==x)
    			winner=p1;
    		else if(r2==f)
    			winner=p2;
    		else
    			winner=p3;
    	}
    	else
    	{
    		numbers();//guess again
    	}
    }
    return winner;
}
}
class GameLauncher
{
	public static void main(String[] args) {
		
		GuessGame obj=new GuessGame();
		obj.persons();
		obj.in();
		Random r=new Random();
		String ans=obj.startGame(r.nextInt(9)+1);
		System.out.println("Winner is="+ans);
	}
}