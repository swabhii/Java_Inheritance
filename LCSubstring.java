//Question 2
import java.lang.*;
import java.util.*;
public class LCSubstring {
    public static void main(String[] args) {
        {
            Scanner s = new Scanner(System.in);
            String str = s.nextLine();
            String st[] = str.split(" ");
            String lcs = "";
            for (int i = 0; i < st[0].length(); i++)
            {
                for(int j=i+1;j<=st[0].length();j++)
                {
                    String sub=st[0].substring(i,j);
                    int k=1;
                    for( k=1;k<st.length;k++) {
                        if (!st[k].contains(sub))
                            break;
                    }
                        if(k==st.length &&lcs.length()<sub.length())
                            lcs=sub;
                }
            }
            System.out.println(lcs);
        }
    }
}
