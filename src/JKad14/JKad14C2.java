package JKad14;

import java.util.Scanner;

public class JKad14C2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        int sum =0;
                do {
            System.out.print("0 から100 までの整数を入力してください＞");
            n = in.nextInt();
            if (n>0){
                sum+=n;
            }
            System.out.println("入力された整数の合計は"+sum+"です！");

        }while (n>100);
    }
}
