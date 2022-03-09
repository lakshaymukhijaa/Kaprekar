import java.util.Arrays;
import java.util.Scanner;

/**
 *
 */
public class Kaprekar {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int num=0,c=0;
        do{
            String x = Integer.toString(n);
            int asc[] = new int[x.length()];

            int desc[] = new int[x.length()];
            for (int i = 0; i < x.length(); i++) {
                asc[i] = Character.getNumericValue(x.charAt(i));
                desc[i] = Character.getNumericValue(x.charAt(i));
            }
            Arrays.sort(asc);
            Arrays.sort(desc);
            int rev[] = new int[x.length()];
            for (int i = 0; i < x.length(); i++) {
                rev[i] = desc[x.length() - i - 1];
            }
            desc = rev;

            int d = 0, a = 0;
            for (int i = 0; i < x.length(); i++) {
                d = d * 10 + desc[i];
            }
            for (int i = 0; i < asc.length; i++) {
                a = a * 10 + asc[i];
            }
//		System.out.println(a);
            num = d - a;
            n=num;
            c++;
        }
        while (num != 6174);
        System.out.println(c);
    }
}
