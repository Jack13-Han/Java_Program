package Program;

/*
課題名 : ITST11_FUDO1
作成者 : Han Wai Tun
作成日 :2025/07/2

*/

import java.util.Scanner;

public class ITST11_FUDO1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("2進数を入力＞");
        double bin = in.nextDouble();
        System.out.printf("\n入力した2進数：%.12f\n\n" , bin);
        int e = 0;
        if (bin >= 1){
            while(bin >= 1){
                bin /= 10;
                e++;
            }
        }
        else{
            while(bin < 0.1){
                bin *= 10;
                e--;
            }
        }
        System.out.printf("%.12f × 2の%d乗\n",bin,e);
    }
}
