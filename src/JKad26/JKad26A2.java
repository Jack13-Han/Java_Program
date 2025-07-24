package JKad26;

import java.util.Scanner;

public class JKad26A2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("整数を入力してください＞");
        int n = in.nextInt();
        System.out.println(JKad26D.toBinaryString(n));

        int bit = 0;            // 1の数
        int count = 0;          // ループ数
        while(n != 0) { // nが0になるまでループする
            n = n & (n-1); // 論理シフト(符号なし（マイナスを無視して）で右に1つシフトする。)
            bit++;
            count++; // ループの数を1増やす。
        }
        System.out.println("1は" + bit + "個あります！");
        System.out.println(count + "回ループしました！");
        in.close();
    }
}
