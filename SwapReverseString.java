//Question 1
import java.util.*;
public class SwapReverseString {
    public static void main(String rg[]) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        String arr[] = str.split(" ");
        System.out.print(arr[arr.length - 1] + " ");
        for (int i = arr.length-2; i >=1; i--) {
            for (int j = arr[i].length()-1; j >= 0; j--) {
                System.out.print(arr[i].charAt(j));
            }
            System.out.print(" ");
        }
        System.out.print(arr[0]);
    }
}

