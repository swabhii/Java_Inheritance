//Question 3
import java.util.*;
import java.lang.*;
import java.util.Arrays;
import java.util.Collections;
public class Anagram {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter 2 Strings");
        String str1=s.nextLine();
        String str2=s.nextLine();
        char ar1[]=str1.toCharArray();
        char ar2[]=str2.toCharArray();
        if(ar1.length>ar2.length)
        {
            for(int i=0;i<ar1.length;i++)
            {
                if(ar1[i+1]!=ar2[i])
                {
                    System.out.println("Not a Anagram");
                    break;
                }
            }
        }
        if(ar1.length<ar2.length)
        {
            for(int i=0;i<ar2.length;i++)
            {
                if(ar1[i]!=ar2[i+1])
                {
                    System.out.println("Not a Anagram");
                    break;
                }
            }
        }
        System.out.println("Strings Are Anagram of each Other");

    }
}
