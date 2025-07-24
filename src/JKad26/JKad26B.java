package JKad26;

import java.util.Scanner;

public class JKad26B {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("整数1を入力してください＞");
        int n1 = in.nextInt();
        System.out.print("整数2を入力してください＞");
        int n2 = in.nextInt();

        System.out.println(JKad26D.toBinaryString(n1)); // JKad26DクラスからtoBinaryStringメソッドを呼び出す
        System.out.println(JKad26D.toBinaryString(n2)); // JKad26DクラスからtoBinaryStringメソッドを呼び出す

        System.out.print("何の演算をしますか？（0：AND、1：OR、2：XOR）＞");
        int op = in.nextInt();
        int rval = 0;
        switch(op) {
            case 0:
                rval = n1 & n2 ; // n1とn2をAND演算で計算して、rvalに結果を格納する。
                break;
            case 1:
                rval =  n1|n2; // n1とn2をOR演算で計算して、rvalに結果を格納する。
                break;
            case 2:
                rval = n1^n2; // n1とn2をXOR演算で計算して、rvalに結果を格納する。
                break;
        }
        System.out.println(JKad26D.toBinaryString(rval)); // JKad26DクラスからtoBinaryStringメソッドを呼び出す

        in.close();
    }
}
