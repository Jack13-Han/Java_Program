package JKad26;

import java.util.Scanner;

public class JKad26S1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        System.out.print("整数1 を入力してください>");
        int n1=in.nextInt();

        System.out.print("整数2 を入力してください>");
        int n2=in.nextInt();

        System.out.println(JKad26D.toBinaryString(n1)); // JKad26DクラスからtoBinaryStringメソッドを呼び出す
        System.out.println(JKad26D.toBinaryString(n2)); // JKad26DクラスからtoBinaryStringメソッドを呼び出す

        System.out.print("何を検出しますか？（0：0→1、1：1→0、2：変化なし）＞");
        int mode=in.nextInt();
        int result = 0;

        switch(mode) {
            case 0: result = ~n1 & n2;break;
            case 1: result = n1 & ~n2;break;
            case 2: result = ~(n1 ^ n2);break;
        }


        System.out.println(JKad26D.toBinaryString(result));


    }
}
