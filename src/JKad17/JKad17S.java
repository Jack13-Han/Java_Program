package JKad17;

import java.util.Random;
import java.util.Scanner;

public class JKad17S {
    public static void main(String[] args) {
        String[] strHands = {"グー", "チョキ", "パー"};
        String[][] strResults = {
                {"あいこだ！", "あなたの勝ち！", "あなたの負け！"},
                {"あなたの負け！", "あいこだ！", "あなたの勝ち！"},
                {"あなたの勝ち！", "あなたの負け！", "あいこだ！"}
        };

        Scanner in= new Scanner(System.in);
        Random ran = new Random();
        int input;

        for (;;){
            int randon =ran.nextInt(3);
            System.out.println(randon);
            System.out.print("あなたは何を出しますか？（0:グー、1:チョキ、2:パー、-1:終了）>");
            input = in.nextInt();

            if (input<0){
                break;
            }

            if (input>2){
                System.out.println("そんな手はありません！");
                continue;
            }

            System.out.println("あなたは "+strHands[input]+" を出した！");
            System.out.println("ＣＰＵは "+strHands[randon]+"を出した！");
            System.out.println(strResults[input][randon]);


        }

    }
}
