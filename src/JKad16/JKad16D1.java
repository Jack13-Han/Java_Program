package JKad16;

import java.util.Scanner;

public class JKad16D1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("1 より大きい整数を入力してください＞");
        int x = in.nextInt();

        for (int i = 1; i <=x; i++) {
            System.out.println(i);
        }

    }
}
