package JKad24;

import java.util.Scanner;

public class JKad24D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("正の整数を入力してください＞");
        int n = in.nextInt();
          n %= 3;
        switch (n){
            case 0:
                System.out.println("割り切れました！");
                break;
            case 1:
                System.out.println("余りは1 です！");
                break;
            case 2:
                System.out.println("余りは2 です！");
                break;

        }

    }
}
