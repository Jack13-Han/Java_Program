package JKad17;

import java.util.Scanner;

public class JKad17D {
    public static void main(String[] args) {
        String[] num={"ピタゴラス","アルキメデス","ユークリッド","エラトステネス","フィボナッチ"};
        Scanner in = new Scanner(System.in);


        for (; ;){
            System.out.print("何号室を見ますか？>");
            int room = in.nextInt();

            if (num.length<=room){
                System.out.println("そんな部屋番号はありません！");
                continue;
            }
            if (room<0){
                break;
            }
            System.out.println(num[room]+"が住んでいます！");
        }
    }
}
