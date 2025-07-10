package JKad22;

import java.util.Scanner;

public class JKad22A1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in  );

        for (;;){
            System.out.print("1 より大きい整数1 を入力してください>");
            int first = in.nextInt();

            System.out.print("1 より大きい整数2 を入力してください>");
            int sec = in.nextInt();

            System.out.println(first+"÷"+sec+"の商と余りを計算します！");
            System.out.print("誰が計算しますか？（1:出木杉、それ以外:のび太）");
            int num=in.nextInt();

            if (num<0)break;

            if (num==1){
                System.out.println("そんなの簡単さ！");
                dekisugi(first,sec);
            }else {
                nobita(first,sec);
            }
        }
    }

    public static void dekisugi(int n1, int n2){
        int sum= n1/n2;
        System.out.println("商は "+sum+"、余りは"+(n1%n2)+" だよ。");
    }

    public static void nobita(int n1, int n2){
        System.out.println("う～ん、割り算なんて難しいや～");
        System.out.println("あ、そうか！リンゴを食べる問題と一緒だね！");
        int i=0;
        while ( n1>n2 ) {
            n1-=n2;
            i++;
            
        }

        System.out.println("商は "+i+"、余りは"+n1+" だよ。");
    }
}
