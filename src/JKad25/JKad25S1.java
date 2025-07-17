package JKad25;

import java.util.Scanner;

public class JKad25S1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("英単語を入力してください＞");
        String abc = in.next();

        int[] abcCount = new int[26]; // アルファベットの文字数分配列を用意。 例）0番目にはAの文字が何回出てきたかを格納する、25番目にはZの文字が何回出てきたかを格納する。
        int other = 0; // アルファベット以外の数を数える

        for (int i = 0; i < abc.length(); i++) {
            int code = abc.charAt(i); // 文字列から1文字ずつ取り出す。

            code &= ~0x20; // アルファベットの小文字を大文字に変換する計算式

            if (code>='A' && code<='Z') { // codeが'A'より大きい　かつ　'Z'より小さい場合
                abcCount[code-'A']++; // code-'A'(65)の位置の数字をインクリメントする
            } else {
                other++; // アルファベット以外の数をインクリメントする
            }
        }

        for (int i = 0; i < abcCount.length; i++) { // 配列abcをループで回して各アルファベットが何文字使われていたか表示する
            System.out.println((char) (i+65)+":" +abcCount[i]);
        }
        System.out.println("その他：" + other); // 最後にアルファベット以外の文字の数を表示する。
    }
}
