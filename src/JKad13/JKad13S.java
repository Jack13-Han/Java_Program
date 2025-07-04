package JKad13;

import java.util.Scanner;

public class JKad13S {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("西暦年号を入力してください＞");
        int year = in.nextInt();

        if ((year%4 == 0 && year%100 !=0) || (year%400 == 0)){
            System.out.println("うるう年です！");
        }else {
            System.out.println("うるう年ではありません！");
        }
    }
}
