package JKad14;

import java.util.Random;
import java.util.Scanner;

public class JKad14X {
    public static void main(String[] args) {
        String[] strHands = {"グー", "チョキ", "パー"};
        String[] strResults = {"あいこだ！", "あなたの勝ち！", "あなたの負け！"};

        Scanner in= new Scanner(System.in);
        Random ran = new Random();
        int n;
        int randon =ran.nextInt(3);
        while (true){
//            System.out.println(randon);
            System.out.print("あなたは何を出しますか？（0:グー、1:チョキ、2:パー、-1:終了）>");
             n = in.nextInt();
             if (n<0){
                 break;
             }

             if (n>2){
                 System.out.println("そんな手はありません！");
                 continue;
             }

//             if (n==0){
//                 if (randon==0){
//                     System.out.println("あなたは"+strHands[0]+"を出した！");
//                     System.out.println("コンピュータは"+strHands[0]+"を出した！");
//                     System.out.println("あいこ");
//                 }
//                 if (randon==1){
//                     System.out.println("あなたは"+strHands[0]+"を出した！");
//                     System.out.println("コンピュータは"+strHands[1]+"を出した！");
//                     System.out.println("あなたの勝ち！");
//                 }
//
//                 if (randon==2){
//                     System.out.println("あなたは"+strHands[0]+"を出した！");
//                     System.out.println("コンピュータは"+strHands[2]+"を出した！");
//                     System.out.println("あなたの負け!");
//                 }
//             }
//
//            if (n==1){
//                if (randon==0){
//                    System.out.println("あなたは"+strHands[1]+"を出した！");
//                    System.out.println("コンピュータは"+strHands[0]+"を出した！");
//                    System.out.println("あなたの負け!");
//                }
//                if (randon==1){
//                    System.out.println("あなたは"+strHands[1]+"を出した！");
//                    System.out.println("コンピュータは"+strHands[1]+"を出した！");
//                    System.out.println("あいこ!");
//                }
//
//                if (randon==2){
//                    System.out.println("あなたは"+strHands[1]+"を出した！");
//                    System.out.println("コンピュータは"+strHands[2]+"を出した！");
//                    System.out.println("あなたの勝ち！");
//                }
//            }
//
//            if (n==2){
//                if (randon==0){
//                    System.out.println("あなたは"+strHands[2]+"を出した！");
//                    System.out.println("コンピュータは"+strHands[0]+"を出した！");
//                    System.out.println(" あなたの勝ち！");
//                }
//                if (randon==1){
//                    System.out.println("あなたは"+strHands[2]+"を出した！");
//                    System.out.println("コンピュータは"+strHands[1]+"を出した！");
//                    System.out.println("あなたの負け!");
//                }
//
//                if (randon==2){
//                    System.out.println("あなたは"+strHands[2]+"を出した！");
//                    System.out.println("コンピュータは"+strHands[2]+"を出した！");
//                    System.out.println(" あいこ!");
//                }
//            }

        }

    }
}
