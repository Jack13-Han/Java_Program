package JKad24;

import java.util.Scanner;

public class JKad24S2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        System.out.print("正の整数を入力してください＞");
        int choice=in.nextInt();

        String str = "";
        do {
            switch(choice%16) { // 16進数なので、nを16で割った余りをチェックする
                default->// nを16で割った余りが、1～9（それ以外）の場合
                    str = (choice%16) + str; // nを16で割った余りの数字を文字と連結する。

                case 10-> // nを16で割った余りが、10の場合
                    str = "A" + str; // 10は16進数で"A"になるので、"A"の文字を連結する。

                case 11-> // nを16で割った余りが、11の場合
                    str = "B" + str; // 11は16進数で"B"になるので、"A"の文字を連結する。

                case 12-> // nを16で割った余りが、12の場合
                    str = "C" + str; // 12は16進数で"C"になるので、"A"の文字を連結する。

                case 13-> // nを16で割った余りが、13の場合
                    str = "D" + str; // 13は16進数で"D"になるので、"A"の文字を連結する。

                case 14-> // nを16で割った余りが、14の場合
                    str = "E" + str; // 14は16進数で"E"になるので、"A"の文字を連結する。

                case 15-> // nを16で割った余りが、15の場合
                    str = "F" + str; // 15は16進数で"F"になるので、"F"の文字を連結する。

            }
            choice/=16; // nを16で割って上書きする
        } while(choice > 0); // nが0になるまでループを繰り返す。
        System.out.println("16進数にすると" + str + "になります！");
    }
}
