package JKad23;

import java.util.Scanner;

public class JKad23A1 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("ひとつめの整数を入力してください>");
        int first=in.nextInt();

        System.out.print("ふたつめの整数を入力してください>");
        int sec=in.nextInt();

        int gcd = gcd(first, sec);
        int lcm = lcm(first, sec);

        System.out.println("最大公約数は"+gcd+" です！");
        System.out.println("最小公倍数は"+lcm+" です！");
    }
    public static int gcd(int n1, int n2){
        while (n1 != n2) {
            if (n1 > n2) {
                n1 = n1 - n2;
            } else {
                n2 = n2 - n1;
            }
        }
        return n1;
    }

    public static int lcm(int n1, int n2){
        return (n1 * n2) / gcd(n1, n2);
    }
}
