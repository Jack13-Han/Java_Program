package JKad24;

import java.util.Scanner;

public class JKad24S2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("正の整数を入力してください＞");
        int n = in.nextInt();
        String str = "";
        while(n > 0){
            int remainder = n % 16; // 16進数なので、nを16で割った余りをチェックする
            str = switch(remainder) {
                default-> // nを16で割った余りが、0～9の場合
                        remainder + str; // 数字を文字列として連結

                case 10->
                        "A" + str;

                case 11->
                        "B" + str;

                case 12->
                        "C" + str;

                case 13->
                        "D" + str;

                case 14->
                        "E" + str;

                case 15->
                        "F" + str;

            };
            n = n / 16; // nを16で割って上書きする
        }  // nが0になるまでループを繰り返す。
        System.out.println("16進数にすると" + str + "になります！");
        in.close();
    }
}