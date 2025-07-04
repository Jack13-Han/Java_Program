package Program;

/*
課題名 : ITST11_JKad04X2
作成者 : Han Wai Tun
作成日 :2025/07/2

*/

import java.util.Scanner;

public class ITST11_JKad04X2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        System.out.print("0から65535までの整数を入力してください＞");
        int n = in.nextInt();
        int n2 = n;
        System.out.print("2から36までの基数を入力してください＞");
        int kisu = in.nextInt();
        System.out.println("最上位ビットから順に表示します!");
        String strBinary = "";
        while(n != 0){
            strBinary = (n % 2) + strBinary;
            n /= 2;
        }
        System.out.printf("2新表記：%s\n", strBinary);
        System.out.printf("10新表記：%d\n",n2);
        System.out.printf("16新表記：%X\n",n2);
        int hen;
        String strSinsu = "";
        while (n2 != 0){
            hen = n2 % kisu;
            strSinsu = (char)(hen >= 10 ? ('A' + hen-10): '0' + hen) + strSinsu;
            n2 /= kisu;
        }
        System.out.printf("%2d新表記：%s\n",kisu,strSinsu);

        in.close();

    }
}
