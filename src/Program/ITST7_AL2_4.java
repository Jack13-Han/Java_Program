package Program;

/*
課題名 : ITST8_AL3_4
作成者 : Han Wai Tun
作成日 :2025/06/11

*/
import java.util.Scanner;

public class ITST7_AL2_4 {
    public static void main(String[] args) {
        int t;
        Scanner in = new Scanner(System.in);
        System.out.print("Ｔを入力>");
        t = in.nextInt();

        if (t>100 || t<0){

        }else {
            if (t>50){
                System.out.println("合格");
            }else {
                System.out.println("不合格");
            }
        }
    }
}
