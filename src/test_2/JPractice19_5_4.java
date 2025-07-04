package test_2;

import java.util.Scanner;

public class JPractice19_5_4 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        System.out.print("0以上の整数を入力してください＞");
        int input=in.nextInt();

        int count=0;
        do {
            input/=10;
            count++;

        }while (input>0);

        System.out.println(count + "桁です！");
    }
}
