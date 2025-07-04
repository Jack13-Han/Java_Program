package Program;

/*
課題名 : ITST7_AL2_3
作成者 : Han Wai Tun
作成日 :2025/06/4

*/
import java.util.Scanner;

public class ITST7_AL2_3 {
    public static void main(String[] args) {
        int a,b;
        Scanner in= new Scanner(System.in);
        System.out.print("Aを入力してください＞");
        a = in.nextInt();

        System.out.print("Bを入力してください＞");
        b=in.nextInt();

        if (a>=60 && b>=60){
            System.out.println("合格");
        }else {
            System.out.println("不合格");
        }
    }
}

