package JKad14;

import java.util.Scanner;

public class JKad14D2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;

        do {
            System.out.print("0 以上の整数を入力してください>");
             n = in.nextInt();
        }while (n<0);

        do {
            System.out.println(n%10);
            n/=10;
        }while (0<n);
    }
}
