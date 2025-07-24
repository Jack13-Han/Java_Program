package JKad26;

import java.util.Scanner;

public class JKad26A1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("整数を入力してください＞");
        int n = in.nextInt();
        System.out.println(JKad26D.toBinaryString(n));

        int bit = 0;            // 1の数
        int count = 0;          // ループ数
        while(n != 0) { // nが0になるまでループする
            if ((n & 0x01) == 1){ // &演算を使って、最下位ビットを算出し、結果が1だった場合
                bit++; // 1の数を加算する
            }
            n >>>=1; // 論理シフト(符号なし（マイナスを無視して）で右に1つシフトする。)
            count++; // ループの数を1増やす。
        }
        System.out.println("1は" + bit + "個あります！");
        System.out.println(count + "回ループしました！");
        in.close();
    }
}
