package JKad22;

import java.util.Random;
import java.util.Scanner;

public class JKad22S {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Random ran= new Random();
        int randon= ran.nextInt(100);
        System.out.println("ここはECC 苦情処理センターです！");
        System.out.println("優秀なスタッフが対応します！");
        System.out.println("苦情番号 :"+randon+" を受け付けた！");

            System.out.print("どうしますか？（1:対応する、それ以外:もうやだ）>");
            int select=in.nextInt();

            if (select==1){
                nobita(randon);

            }else {
                System.out.println("おつかれさまでした！");
            }




        System.out.println();

    }
    public static void nobita(int n){
        if (n<20){
            System.out.println("のび太 「ぼくにまかせて！」");
            System.out.println("のび太が対応しました！");
        }else {
            System.out.println("のび太 「ジャイアン、お願い！」");
            jaian(n);
        }


    }

    public static void jaian(int n){
        if (n%4 == 0){
            System.out.println("ジャイアン「オレさまにまかせろ！」");
            System.out.println("ジャイアンが対応しました！");
        }else {
            System.out.println("ジャイア「スネ夫、お前にゆずってやる！」");
            suneo(n);
        }
    }
    public static void suneo(int n){
        if (n%3 == 0){
            System.out.println("スネ夫「ぼくの出番だ！」");
            System.out.println("スネ夫が対応しました！");
        }else {
            System.out.println("スネ夫「出木杉！まかせた！」");
            dekisugi(n);
        }
    }
    public static void dekisugi(int n){
        System.out.println("出木杉「こんなの簡単さ」");
        System.out.println("「出木杉が対応しました！」");
    }
}
