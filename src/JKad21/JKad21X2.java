package JKad21;

import java.util.Scanner;

public class JKad21X2 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        System.out.print("組み合わせを求める金額を入力してください>");
        int input=in.nextInt();

        int count = 0;
        for (int a = 0; a <= input / 100; a++) {
            for (int b = 0; b <= (input - 100*a) / 50; b++) {
                int c = (input - 100*a - 50*b) / 10;
                if (100*a + 50*b + 10*c == input) {
                    count++;
                    System.out.println("100円: " + a + ", 50円: " + b + ", 10円: " + c);
                }
            }
        }
        System.out.println(input+" 円になる組み合わせは全部で"+count+" 通りです！");


    }
}
