package JKad23;

import java.util.Scanner;

public class JKad23A2 {
    static Scanner in= new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("1 より大きい整数を入力してください>");
        int input = in.nextInt();


        if (input <= 1) {
            System.out.println("1より大きい整数を入力してください");
            return;
        }
        int sum= integrate(input);
        System.out.println("1 から"+input+" まで加算します！");
        System.out.println("合計は"+sum+" です！！");
    }

    public static int integrate(int n){
        if (n==1){
            return 1;
        }else {
            return integrate(n-1)+n;
        }

    }
}
