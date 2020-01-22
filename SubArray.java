//Question 3
import java.util.*;
class SubArray
{
    public static void array(int a[])
    {
        for (int j = 0; j < a.length; j++)
        {
            int sum = 0;
            for (int i = j; i < a.length; i++)
            {
                sum=sum+a[i];
                if (sum == 0) {
                    System.out.println("["+i+","+j+"]");
                }
            }
        }
    }

    
    public static void main (String[] args)
    {
        int[] a = { 1,2,3,6,-12,4 };

        array(a);
    }
}