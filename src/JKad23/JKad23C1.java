package JKad23;

import java.util.Scanner;

public class JKad23C1 {
    static Scanner in= new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("1 より大きい整数を入力してください>");
        int input = in.nextInt();

        int sum= integrate(input);
        System.out.println("1 から"+input+" まで加算します！");
        System.out.println("合計は"+sum+" です！！");
    }

    public static int integrate(int n){
        int sum=0;
        for (int i = 0; i <= n; i++) {
            sum+=i;
        }
        return sum;
    }

}
