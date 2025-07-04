package JKad21;

import java.util.Scanner;

public class JKad21A1 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        System.out.print("9 桁までの整数を入力してください＞");
        int input = in.nextInt();
        for (;;){
            if (input==0)break;
            int sum;
            sum = input%10;

            for (int i = sum; i >0; i--) {

                System.out.print("*");

            }
            System.out.println();


            input/=10;
        }
    }
}
